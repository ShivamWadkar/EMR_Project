package com.example.oauth2tutorial.SecurityConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	//@Override
	public void configure(HttpSecurity httpsecurity)throws Exception
	{
		httpsecurity
		          .antMatcher("/**").authorizeRequests()
		          .antMatchers("/").permitAll()
		          .anyRequest().authenticated()
		          .and()
		          .oauth2Login();
	}

}
