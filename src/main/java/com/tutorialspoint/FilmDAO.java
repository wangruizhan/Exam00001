package com.tutorialspoint;
import java.util.List;
import javax.sql.DataSource;
public interface FilmDAO {
  
  
   public void create(String title, String description,Integer language_id);
   /** 
    * This is the method to be used to list down
    * a record from the Student table corresponding
    * to a passed student id.
    */
  
   
 
}