package org.naka.demo.springWebhook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringWebhookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebhookApplication.class, args);
	}

}

