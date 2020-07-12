package me.stone.play.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class PlayRestApiAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayRestApiAdminApplication.class, args);
	}

}
