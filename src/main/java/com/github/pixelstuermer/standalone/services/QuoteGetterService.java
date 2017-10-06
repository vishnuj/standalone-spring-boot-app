package com.github.pixelstuermer.standalone.services;

import com.github.pixelstuermer.standalone.model.QuoteResponse;

public interface QuoteGetterService {

   public QuoteResponse getQuotes( String slug );

}
