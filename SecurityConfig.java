package com.example.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.security.Security;

@Configuration
public class SecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails user= User.withUsername("user")
                .password(passwordEncoder().encode("password"))
                .roles("USER")
                .build();
        UserDetails admin=User.withUsername("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user,admin);

    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests(authorize->authorize
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/user/**").hasRole("USER")
                        .requestMatchers("/").permitAll()
                )
                .formLogin(formLogin->formLogin.permitAll())
                .logout(logout->logout.permitAll()
                );
        return http.build();

    }

}
