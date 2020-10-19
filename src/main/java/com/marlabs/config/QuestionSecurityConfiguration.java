package com.marlabs.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class QuestionSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/welcome")
        .hasAnyRole("USER", "ADMIN").antMatchers("/getQuestion").hasAnyRole("USER", "ADMIN")
        .antMatchers("/submitAnswer").hasAnyRole("USER", "ADMIN")
        .anyRequest().authenticated().and().formLogin().defaultSuccessUrl("/welcome", true)
            .permitAll().and().logout().permitAll();

        http.csrf().disable();
    }
    
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
        authenticationMgr.inMemoryAuthentication().withUser("mathsadmin").password("mathsadmin")
            .authorities("ROLE_USER").and().withUser("mathsuser").password("mathsuser")
            .authorities("ROLE_USER", "ROLE_ADMIN");
    }

}