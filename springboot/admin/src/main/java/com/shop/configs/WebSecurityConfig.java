/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import com.shop.filters.JWTAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    private static final String[] publicURL = { "/login**", "/adminlte**", "/404.html", "/home" };
    private static final String[] secureURL = { "/product/**", "/customer/**" };

    @Override
    protected void configure(HttpSecurity http) throws Exception {

	http.csrf().disable();

	// Public page
	http.authorizeRequests().antMatchers(publicURL).permitAll();

	// Secure page
	http.authorizeRequests().antMatchers(secureURL).access("hasRole('ROLE_ADMIN')");

	// Rest Api secure
	http.authorizeRequests()//
		.antMatchers(HttpMethod.POST, "/api/**")//
		.access("hasRole('ROLE_ADMIN')")//
		.and()//
		.addFilterAfter(new JWTAuthenticationFilter(authenticationManager()),
			UsernamePasswordAuthenticationFilter.class);

	// Login Form
	http.authorizeRequests() //
		.and()//
		.formLogin()//
		.loginProcessingUrl("/login")// POST Method
		.loginPage("/login").permitAll()//
		.defaultSuccessUrl("/dashboard/index.html")//
		.failureUrl("/login?error=true")//
		.usernameParameter("username")//
		.passwordParameter("password")//
		.and().addFilterAfter(new JWTAuthenticationFilter(authenticationManager()),
			UsernamePasswordAuthenticationFilter.class);

	// Logout Page
	http.authorizeRequests().and().logout() //
		.logoutUrl("/logout") //
		.logoutSuccessUrl("/login") //
		.deleteCookies("JSESSIONID");

	// Remember Me
	http.authorizeRequests().and() //
		.rememberMe()//
		.tokenRepository(this.persistentTokenMemoryRepository()) //
		.tokenValiditySeconds(30 * 24 * 60 * 60); // 30days
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

	InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder> //
	mngConfig = auth.inMemoryAuthentication();

	UserDetails u1 = User.withUsername("admin@pos.com").password(passwordEncoder().encode("password"))
		.roles("ADMIN").build();
	UserDetails u2 = User.withUsername("user@pos.com").password(passwordEncoder().encode("password")).roles("USER")
		.build();

	mngConfig.withUser(u1);
	mngConfig.withUser(u2);
    }

    // Token stored in Table (Persistent_Logins)
    @Bean
    public PersistentTokenRepository persistentTokenDBRepository() {
	JdbcTokenRepositoryImpl db = new JdbcTokenRepositoryImpl();
	db.setDataSource(dataSource);
	return db;
    }

    // Token stored in Memory (Of Web Server).
    @Bean
    public PersistentTokenRepository persistentTokenMemoryRepository() {
	InMemoryTokenRepositoryImpl memory = new InMemoryTokenRepositoryImpl();
	return memory;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
	BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	return bCryptPasswordEncoder;
    }

}
