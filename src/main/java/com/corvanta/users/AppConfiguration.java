package com.corvanta.users;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = {"com.corvanta.users.repository","com.corvanta.hostel.repository"})
@EntityScan(basePackages = {"com.corvanta.users.entity","com.corvanta.hostel.entity"})
@EnableTransactionManagement
@EnableAutoConfiguration
public class AppConfiguration {

}
