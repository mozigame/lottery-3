package com.github.chengbin.admin.filter;

import com.github.chengbin.admin.biz.AuthBiz;
import com.github.chengbin.admin.service.GateService;
import com.github.chengbin.admin.util.ClientUtil;
import com.github.chengbin.core.vo.authority.PermissionInfo;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 认证过滤器
 *
 * @author LuPindong
 * @time 2017-05-07 10:32
 */
@Slf4j
@Order(1)
@WebFilter(filterName = "authenticationFilter", urlPatterns = "/api/*")
public class AuthenticationFilter implements Filter {

    @Autowired
    private AuthBiz authService;
    @Autowired
    private GateService gateService;
    @Value("${gate.api.header}")
    private String tokenHead;
    @Value("${zuul.prefix:api}")
    private String prefix;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String requestUri = request.getRequestURI();
        final String method = request.getMethod();
        log.debug("IP：{}，访问资源：{}，请求方式：{}", ClientUtil.getClientIp(request),requestUri,method);
        requestUri = requestUri.substring(prefix.length()+1);
        final String  finalRequestUri = requestUri.substring(requestUri.indexOf("/"));
        List<PermissionInfo> serviceInfo = gateService.getGateServiceInfo();
        // 判断资源是否启用权限约束
        Collection<PermissionInfo> result = Collections2.filter(serviceInfo, new Predicate<PermissionInfo>() {
            @Override
            public boolean apply(PermissionInfo permissionInfo) {
                String url = permissionInfo.getUri();
                String uri = url.replaceAll("\\{\\*\\}", "[a-zA-Z\\\\d]+");
                String regEx = "^" + uri + "$";
                return (Pattern.compile(regEx).matcher(finalRequestUri).find() || finalRequestUri.startsWith(url + "/"))
                        && method.equals(permissionInfo.getMethod());
            }
        });
        if(result.size()>0){
            String token = request.getHeader(tokenHead);
            if(!authService.validate(token,finalRequestUri+":"+method)){
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
                return ;
            }
        }
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
