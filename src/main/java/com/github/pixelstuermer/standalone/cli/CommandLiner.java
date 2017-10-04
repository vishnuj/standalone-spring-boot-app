package com.github.pixelstuermer.standalone.cli;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLiner implements CommandLineRunner {

   private final Logger LOGGER = LoggerFactory.getLogger( this.getClass() );

   public void run( String... args ) throws Exception {
      LOGGER.info( "Application started at {}", new Date().toString() );
   }

}
