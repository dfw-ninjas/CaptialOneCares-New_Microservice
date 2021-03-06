package com.security;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	  @Override
	    protected void configure(HttpSecurity http) throws Exception{
	        http.cors().and().csrf().disable();
	    }

	    @Bean
	    CorsConfigurationSource corsConfigurationSource() {
	        CorsConfiguration configuration = new CorsConfiguration();
	        configuration.setAllowedOrigins(Arrays.asList("*"));
	        configuration.setAllowedMethods(Arrays.asList("*"));
	        configuration.setAllowedHeaders(Arrays.asList("*"));
	        configuration.setAllowCredentials(true);
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        source.registerCorsConfiguration("/**", configuration);
	        return source;
	    }
	/*
	 * @Override public void configure(HttpSecurity http) throws Exception {
	 * http.requestMatchers().antMatchers("/questions").anyRequest();
	 * //http.requestMatchers().antMatchers(
	 * "/questions?question=que1&answer=ans1&options=op1,op2,op3").anyRequest(); }
	 */
}