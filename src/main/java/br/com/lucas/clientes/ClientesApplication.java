package br.com.lucas.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class}) //retirar após config spring security
public class ClientesApplication {

	public static void main(String[] args) {

		SpringApplication.run(ClientesApplication.class, args);
	}

}
