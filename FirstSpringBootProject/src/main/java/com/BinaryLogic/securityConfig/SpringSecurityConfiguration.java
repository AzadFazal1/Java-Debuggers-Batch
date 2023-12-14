package com.BinaryLogic.securityConfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

//	@Bean
//	public InMemoryUserDetailsManager userDetailsManager() {
//		
//		UserDetails sam = User.builder()
//				.username("sam")
//				.password("{noop}abc123")
//				.roles("EMPLOYEE")
//				.build();
//		UserDetails john = User.builder()
//				.username("john")
//				.password("{noop}abc123")
//				.roles("EMPLOYEE", "MANAGER")
//				.build();
//		UserDetails bob = User.builder()
//				.username("bob")
//				.password("{noop}abc123")
//				.roles("EMPLOYEE", "MANAGER", "ADMIN")
//				.build();
//		return new InMemoryUserDetailsManager(sam, john, bob);
//		
//	}
	
	@Bean
	public UserDetailsManager userDetailsManager(DataSource dataSource) {
		return new JdbcUserDetailsManager(dataSource);
	}
	
	@Bean
	public  SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(configurer -> configurer
				.requestMatchers(HttpMethod.GET, "/employee").hasRole("EMPLOYEE")
				.requestMatchers(HttpMethod.GET, "/employee/**").hasRole("EMPLOYEE")
				.requestMatchers(HttpMethod.POST, "/employee").hasRole("MANAGER")
				.requestMatchers(HttpMethod.PUT, "/employee/**").hasRole("MANAGER")
				.requestMatchers(HttpMethod.DELETE, "/employee/**").hasRole("ADMIN")
				);
		http.httpBasic(Customizer.withDefaults());
		http.csrf(csrf->csrf.disable());
		return http.build();
		
	}
	
	
	
	
	
	
}
