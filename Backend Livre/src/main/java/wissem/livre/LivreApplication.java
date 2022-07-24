package wissem.livre;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import wissem.livre.service.IStorageService;
import wissem.livre.service.UserService;

@SpringBootApplication
public class LivreApplication {
	
	@Resource
	IStorageService storageService;
	
	@Autowired
	  UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(LivreApplication.class, args);
		
	}
	
}
