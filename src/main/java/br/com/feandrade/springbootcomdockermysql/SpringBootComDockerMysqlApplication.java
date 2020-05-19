package br.com.feandrade.springbootcomdockermysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.feandrade.springbootcomdockermysql")
@EntityScan(basePackages = "br.com.feandrade.springbootcomdockermysql.model")
public class SpringBootComDockerMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootComDockerMysqlApplication.class, args);
	}

}
