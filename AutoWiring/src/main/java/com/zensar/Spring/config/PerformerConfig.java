package com.zensar.Spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.zensar.Spring.instruments","com.zensar.Spring.performers"})
public class PerformerConfig {

}
