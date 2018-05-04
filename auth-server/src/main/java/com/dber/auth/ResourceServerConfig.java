package com.dber.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
  @Override
  public void configure(HttpSecurity http) throws Exception {
    http
            .csrf().disable()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .requestMatchers().antMatchers("/**")
            .and().authorizeRequests()
            .antMatchers("/**").permitAll().anyRequest().authenticated()
            .and().logout()
            .logoutUrl("/logout")
            .clearAuthentication(true)
            .logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler());
//            .addLogoutHandler(customLogoutHandler());
  }
}
