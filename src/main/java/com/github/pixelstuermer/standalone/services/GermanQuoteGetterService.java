package com.github.pixelstuermer.standalone.services;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.github.pixelstuermer.standalone.model.QuoteResponse;

import lombok.Data;

@Data
public class GermanQuoteGetterService implements QuoteGetterService {

   private RestTemplate restTemplate;
   private String url;

   public GermanQuoteGetterService( String url ) {
      restTemplate = new RestTemplate();
      this.url = url;
   }

   @Override
   public QuoteResponse getQuotes( String slug ) {
      MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
      params.add( "slug", slug );
      params.add( "count", "10" );

      UriComponents uri = UriComponentsBuilder.fromHttpUrl( url ).queryParams( params ).build();
      return restTemplate.getForObject( uri.toUriString(), QuoteResponse.class );
   }

}
