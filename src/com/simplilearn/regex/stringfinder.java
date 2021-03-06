package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringfinder {

   public static void main( String args[] ) {
      // String to be scanned to find the pattern.
      String line = "This is a example of pattern matching for 2022?";
      String pattern = "(.*)(\\d+)(.*)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
      }else {
         System.out.println("NO MATCH");
      }
   }
}