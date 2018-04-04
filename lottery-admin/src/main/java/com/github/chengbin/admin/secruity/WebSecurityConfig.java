package com.github.chengbin.admin.secruity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-02 12:02
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  private UserDetailsService gateUserDetailsService;

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.formLogin().loginPage("/login").defaultSuccessUrl("/index").permitAll().and()
        .logout().logoutSuccessUrl("/login").invalidateHttpSession(true).and().authorizeRequests()
        .antMatchers("/**/*.css", "/img/**", "/**/*.js","/api/**","/druid/**") // 放开"/api/**",通过oauth2.0来鉴权
        .permitAll().and().authorizeRequests().antMatchers("/**").authenticated();
    http.csrf().disable();
    http.headers().frameOptions().disable();
    http.httpBasic();
  }

  @Override
  public void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(gateUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
  }

  public static void main(String[] args) {
    BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
    System.out.println(bc.encode("123"));
  }

}
