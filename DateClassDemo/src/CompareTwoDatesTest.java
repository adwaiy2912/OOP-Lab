/*
 * "java.text" package: Provides classes and interfaces for handling text, dates, 
 * numbers, and messages in a manner independent of natural languages.
 * 
 */
import java.text.*;
import java.util.Date;

public class CompareTwoDatesTest {
   public static void main(String[] args) throws ParseException {
      SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");   
      //takes date in yyyy-MM-dd
      
      //parse the date string to date object using sdformat.parse()
      Date d1 = sdformat.parse("2021-08-10");	
      Date d2 = sdformat.parse("2021-09-10");
      
      System.out.println("d1: " + sdformat.format(d1));
      System.out.println("d2: " + sdformat.format(d2));
      
      if(d1.compareTo(d2) > 0) {
         System.out.println("Date 1 occurs after Date 2");
      } 
      else if(d1.compareTo(d2) < 0) {
         System.out.println("Date 1 occurs before Date 2");
      } 
      else if(d1.compareTo(d2) == 0) {
         System.out.println("Both dates are equal");
      }
   }
}