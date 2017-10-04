package com.github.pixelstuermer.standalone.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

public class FriendlyDateTeller implements DateTeller {

   @Value( "${application.standalone-text}" )
   private String dateTellerText;

   public String tellDate() {
      return dateTellerText + ": " + new Date().toString();
   }

}
