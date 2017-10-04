package com.github.pixelstuermer.standalone.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan( basePackages = "${base.packages}" )
public class ApplicationStarter {

   // TODO add tests
   // TODO delete other workspace and project

   public static void main( String[] args ) {
      SpringApplication.run( ApplicationStarter.class, args );
   }

}
