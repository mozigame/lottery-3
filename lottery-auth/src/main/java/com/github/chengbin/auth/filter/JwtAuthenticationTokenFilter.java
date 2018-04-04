package com.github.chengbin.auth.filter;

import com.github.chengbin.auth.entity.User;
import com.github.chengbin.auth.jwt.JwtTokenUtil;
import com.github.chengbin.auth.jwt.JwtUser;
import com.github.chengbin.auth.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhangcb
 * @created 2017-12-14 17:28.
 */
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Value("${jwt.header}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //1.从header中获取token
        String authHeader = request.getHeader(this.tokenHeader);
        if (authHeader != null && authHeader.startsWith(tokenHead)) {
            final String authToken = authHeader.substring(tokenHead.length()); // The part after "Bearer "
            String username = jwtTokenUtil.getUsernameFromToken(authToken);
            logger.info("checking authentication " + username);
            if (username != null) {
                User user = userService.findByUsername(username);
                JwtUser jwtUser = new JwtUser();
                BeanUtils.copyProperties(user,jwtUser);
                //2.验证token是否有效
                if (jwtTokenUtil.validateToken(authToken, jwtUser)) {
                    logger.info("authenticated user " + username + ", setting security context");
                }
            }
        }
        filterChain.doFilter(request, response);
    }
}
