package com.company.SpringEmailDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailDemoApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailDemoApplication.class, args);

	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail(){
		emailSenderService.sendEmail("nj43535@gmail.com",
				"this is MAil Sender Subject",
				"This is Body of Email");
	}

}
