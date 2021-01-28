package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//change in my status-hb-134
		ConfigurableApplicationContext run=SpringApplication.run(Application.class,args);
int a=10;
int b=20;
String str="Rajkumar";
		run.close();
	}

}
