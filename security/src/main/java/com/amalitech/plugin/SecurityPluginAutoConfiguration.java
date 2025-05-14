package com.amalitech.plugin;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@AutoConfiguration
public class SecurityPluginAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public SecurityFilterChain pluginFilterChain(HttpSecurity http) throws Exception {
         return http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated()).build();
    }
}