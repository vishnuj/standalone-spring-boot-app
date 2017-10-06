package com.github.pixelstuermer.standalone.cli;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pixelstuermer.standalone.services.DateTeller;

@Component
public class CommandLiner implements CommandLineRunner {

   @Autowired
   DateTeller simpleDateTeller;

   @Autowired
   DateTeller friendlyDateTeller;

   private final Logger LOGGER = LoggerFactory.getLogger( this.getClass() );

   @Override
   public void run( String... args ) throws Exception {
      LOGGER.info( "Application started at {}", new Date().toString() );
      System.out.println( simpleDateTeller.tellDate() );
      System.out.println( friendlyDateTeller.tellDate() );
      LOGGER.info( "Application terminated at {}", new Date().toString() );

      RestTemplate restTemplate = new RestTemplate();
      Map<String, String> headers = new HashMap<>();
      headers.put( "id", "59c9013cb689f60261be342b" );

      String url1 = "https://little-notes.herokuapp.com/read/all";
      String response1 = restTemplate.exchange( url1, HttpMethod.GET, null, String.class ).getBody();
      System.out.println( response1 );

      HttpHeaders httpHeaders = new HttpHeaders();
      httpHeaders.add( "id", "59c9013cb689f60261be342b" );
      HttpEntity<String> entity = new HttpEntity<>( httpHeaders );
      String url2 = "https://little-notes.herokuapp.com/read/id";
      String response2 = restTemplate.exchange( url2, HttpMethod.GET, entity, String.class ).getBody();
      System.out.println( response2 );

      NoteEntry entry2 = new NoteEntry();
      ObjectMapper mapper = new ObjectMapper();
      entry2 = mapper.readValue( response2, NoteEntry.class );
      System.out.println( entry2.getPayload().get( "note" ) );

      HttpHeaders httpHeaders2 = new HttpHeaders();
      httpHeaders2.add( "id", "59c9013cb689f60261be342b" );
      HttpEntity<NoteEntry> entity2 = new HttpEntity<>( httpHeaders2 );
      String url3 = "https://little-notes.herokuapp.com/read/id";
      try {
         ResponseEntity<NoteEntry> resopnse = restTemplate.exchange( url3, HttpMethod.GET, entity2, NoteEntry.class );
         System.out.println( resopnse.getBody().getPayload().get( "note" ) );
         NoteEntry entry = restTemplate.exchange( url3, HttpMethod.GET, entity2, NoteEntry.class ).getBody();
         System.out.println( entry.getPayload().get( "note" ) );
      }
      catch ( Exception e ) {
         e.printStackTrace();
      }
   }

}
