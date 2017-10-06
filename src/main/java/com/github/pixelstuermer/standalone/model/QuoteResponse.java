package com.github.pixelstuermer.standalone.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class QuoteResponse {

   private String status;
   private int count;
   private List<Quote> posts;

   public QuoteResponse() {
      posts = new ArrayList<>();
   }

}
