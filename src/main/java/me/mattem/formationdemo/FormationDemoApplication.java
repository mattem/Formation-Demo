package me.mattem.formationdemo;

import me.mattem.formation.EnableFormation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFormation(basePackages={"me.mattem"}, uniqueClassNames=true)
public class FormationDemoApplication {
	 
	public static void main(String[] args) {
		 SpringApplication.run(FormationDemoApplication.class, args);
	 }
}
