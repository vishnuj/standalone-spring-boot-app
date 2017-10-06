package com.github.pixelstuermer.standalone.cli;

import java.util.HashMap;

import lombok.Data;

@Data
public class NoteEntry {

   private String _id;
   private HashMap<String, String> metaData;
   private HashMap<String, String> payload;

   public NoteEntry() {
      metaData = new HashMap<>();
      payload = new HashMap<>();
   }

}
