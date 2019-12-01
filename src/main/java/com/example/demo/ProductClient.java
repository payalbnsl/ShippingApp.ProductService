package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;


@EnableMongoRepositories(basePackages= {"com.example.demo.dao"})
@EntityScan(basePackages= {"com.example.demo.dto"})
@EnableAutoConfiguration
@EnableTransactionManagement(proxyTargetClass=false)
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=false)
@CrossOrigin(origins="http://localhost:4200/")
public class ProductClient  {
	public static void main(String[] args) {
		SpringApplication.run(ProductClient.class, args);
	}

}
