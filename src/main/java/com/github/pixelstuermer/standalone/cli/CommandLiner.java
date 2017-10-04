package com.github.pixelstuermer.standalone.cli;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.pixelstuermer.standalone.services.DateTeller;

@Component
public class CommandLiner implements CommandLineRunner {

   @Autowired
   DateTeller simpleDateTeller;

   @Autowired
   DateTeller friendlyDateTeller;

   private final Logger LOGGER = LoggerFactory.getLogger( this.getClass() );

   public void run( String... args ) throws Exception {
      LOGGER.info( "Application started at {}", new Date().toString() );
      System.out.println( simpleDateTeller.tellDate() );
      System.out.println( friendlyDateTeller.tellDate() );
      LOGGER.info( "Application terminated at {}", new Date().toString() );
   }

}
