package com.github.pixelstuermer.standalone.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pixelstuermer.standalone.services.DateTeller;
import com.github.pixelstuermer.standalone.services.FriendlyDateTeller;
import com.github.pixelstuermer.standalone.services.SimpleDateTeller;

@Configuration
public class DateTellerConfig {

   @Bean
   public DateTeller simpleDateTeller() {
      return new SimpleDateTeller();
   }

   @Bean
   public DateTeller friendlyDateTeller() {
      return new FriendlyDateTeller();
   }

}
