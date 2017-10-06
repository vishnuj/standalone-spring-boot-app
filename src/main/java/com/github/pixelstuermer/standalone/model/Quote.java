package com.github.pixelstuermer.standalone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quote {

   private int id;
   private String title;
   private String date;

}
