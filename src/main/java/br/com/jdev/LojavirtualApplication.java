package br.com.jdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "br.com.jdev.model")
@ComponentScan(basePackages={"br.*"})
@EnableJpaRepositories(basePackages = {"br.com.jdev.repository"})
@EnableTransactionManagement
public class LojavirtualApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojavirtualApplication.class, args);
	}

}
