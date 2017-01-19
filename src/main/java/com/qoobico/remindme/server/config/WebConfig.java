package com.qoobico.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by air on 19.01.17.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.qoobici.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
