package com.github.pixelstuermer.standalone.cli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLiner implements CommandLineRunner {

   public void run( String... args ) throws Exception {
      System.out.println( "Hello World!" );
   }

}
