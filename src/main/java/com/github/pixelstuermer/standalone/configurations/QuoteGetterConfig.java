package com.github.pixelstuermer.standalone.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pixelstuermer.standalone.services.GermanQuoteGetterService;

@Configuration
public class QuoteGetterConfig {

   @Bean
   public GermanQuoteGetterService germanQuoteGetterService( @Value( "${quote.url}" ) String quoteUrl ) {
      return new GermanQuoteGetterService( quoteUrl );
   }

}
