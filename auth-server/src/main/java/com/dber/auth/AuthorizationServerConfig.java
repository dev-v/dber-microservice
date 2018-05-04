package com.dber.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

  @Override
  public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//    security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
    super.configure(security);
  }

  @Override
  public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//    clients.withClientDetails
    super.configure(clients);
  }

  @Override
  public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
    super.configure(endpoints);
  }
}
