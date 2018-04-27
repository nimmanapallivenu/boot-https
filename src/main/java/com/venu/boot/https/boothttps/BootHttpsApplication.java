package com.venu.boot.https.boothttps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootHttpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootHttpsApplication.class, args);
	}
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String sayHello(){
		return "welcome to https";
	}
	
}
