package com.github.chengbin.auth.controller;

import com.github.chengbin.auth.entity.User;
import com.github.chengbin.auth.jwt.JwtAuthenticationRequest;
import com.github.chengbin.auth.jwt.JwtAuthenticationResponse;
import com.github.chengbin.auth.service.AuthService;
import com.github.chengbin.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangcb
 * @created 2017-12-14 17:51.
 */
@RefreshScope
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private AuthService authService;
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String test(){
        return tokenHeader;
    }

    @RequestMapping(value = "${jwt.route.authentication.path:token}", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(
            @RequestBody JwtAuthenticationRequest authenticationRequest) throws Exception {
        final String token = authService.login(authenticationRequest.getUsername(), authenticationRequest.getPassword());

        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
    }

    @RequestMapping(value = "${jwt.route.authentication.refresh:refresh}", method = RequestMethod.GET)
    public ResponseEntity<?> refreshAndGetAuthenticationToken(
            HttpServletRequest request) throws Exception{
        String token = request.getHeader(tokenHeader);
        String refreshedToken = authService.refresh(token);
        if(refreshedToken == null) {
            return ResponseEntity.badRequest().body(null);
        } else {
            return ResponseEntity.ok(new JwtAuthenticationResponse(refreshedToken));
        }
    }

    @RequestMapping(value = "${jwt.route.authentication.register:register}", method = RequestMethod.POST)
    public User register(@RequestBody User addedUser) throws Exception{
        return authService.register(addedUser);
    }

    @RequestMapping(value = "verify", method = RequestMethod.GET)
    public ResponseEntity<?> verify(@RequestParam("token") String token) throws Exception {
        boolean result = authService.validate(token);
        return ResponseEntity.ok(result);
    }

    @RequestMapping(value = "invalid", method = RequestMethod.POST)
    public ResponseEntity<?> invalid(@RequestParam("token") String token) throws Exception{
        authService.invalid(token);
        return ResponseEntity.ok(true);
    }

    @RequestMapping("/{name}")
    public User getInfo(@PathVariable("name") String name){
        return userService.findByUsername(name);
    }

}
