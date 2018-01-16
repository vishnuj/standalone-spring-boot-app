package com.github.pixelstuermer.standalone.application;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan( basePackages = "${application.base-packages}" )
public class ApplicationStarter {

   public static void main( String[] args ) {
      new SpringApplicationBuilder( ApplicationStarter.class )
         .web( false )
         .run( args );
   }

}
