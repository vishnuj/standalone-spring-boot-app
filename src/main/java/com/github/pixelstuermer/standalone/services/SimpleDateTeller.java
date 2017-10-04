package com.github.pixelstuermer.standalone.services;

import java.util.Date;

public class SimpleDateTeller implements DateTeller {

   public String tellDate() {
      return new Date().toString();
   }

}
