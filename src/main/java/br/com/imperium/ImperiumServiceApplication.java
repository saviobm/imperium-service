package br.com.imperium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableJpaRepositories("br.com.imperium.repository")
@EntityScan(value="br.com.imperium.modelo")
public class ImperiumServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImperiumServiceApplication.class, args);
	}
}
