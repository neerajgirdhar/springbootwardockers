package com.example.springboot.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.SimpleCommandLinePropertySource;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.example.springboot.dataservice.controller")


public class SpringBootJobTwo extends SpringBootServletInitializer {
	private static final Logger log = LoggerFactory
			.getLogger(SpringBootJobTwo.class);

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(SpringBootJobTwo.class);
		String springProfile1 = System.getenv().get("spring.profiles.active");
		log.info("springProfile1 Set(SYATEN)-->" + springProfile1);
		/*SimpleCommandLinePropertySource commandLinePropertySource = new SimpleCommandLinePropertySource(
				args);
		String springProfile = commandLinePropertySource
				.getProperty("spring.profiles.active");

		ConfigurableApplicationContext conf = app.run(args);
		log.info("springProfile Set-->" + springProfile);
		String springProfile1 = System.getenv().get("spring.profiles.active");
		log.info("springProfile1 Set(SYATEN)-->" + springProfile1);
		
		SpringBootJobTwo springBootJob2 = (SpringBootJobTwo) conf
				.getBean("springBootJobTwo");
		springBootJob2.execute();

		log.info("Application '{}' is running! ");
		String applicationName = conf.getEnvironment().getProperty(
				"spring.application.name");
		String applicationPort = conf.getEnvironment().getProperty(
				"server.port");
		log.info("Application name  " + applicationName);
		log.info("Application Port  " + applicationPort);*/
	}

	@Bean
	RestTemplate rest(){return new RestTemplate();}

	/*public void execute() {

		String execution_enviorment = System
				.getProperty("properties.execution_enviorment");
		log.info("Fetching ExecutionEnviorment as SystemProperty--->"
				+ execution_enviorment);
		log.info("2nd Spring boot application running....");

	}*/

}
