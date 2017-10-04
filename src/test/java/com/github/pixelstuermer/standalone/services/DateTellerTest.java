package com.github.pixelstuermer.standalone.services;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

public class DateTellerTest {

   private static final String BLANK = " ";

   private DateTeller simpleDateTeller;
   private DateTeller friendlyDateTeller;

   @Before
   public void setUp() throws Exception {
      simpleDateTeller = new SimpleDateTeller();
      friendlyDateTeller = new FriendlyDateTeller();
   }

   @Test
   public void testSimpleTellDate() {
      try {
         DateFormat format = new SimpleDateFormat( "EEE MMM dd HH:mm:ss z YYYY", Locale.ENGLISH );
         format.parse( simpleDateTeller.tellDate() );
         assertTrue( true );
      }
      catch ( Exception e ) {
         e.printStackTrace();
         fail();
      }
   }

   @Test
   public void testFriendlyTellDate() {
      try {
         DateFormat format = new SimpleDateFormat( "EEE MMM dd HH:mm:ss z YYYY", Locale.ENGLISH );
         format.parse( friendlyDateTeller.tellDate().split( ":" + BLANK )[1] );
         assertTrue( true );
      }
      catch ( Exception e ) {
         e.printStackTrace();
         fail();
      }
   }

}
