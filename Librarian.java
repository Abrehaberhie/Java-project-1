package libraryProjectToBeSubmitted;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Librarian {
	
	  
	    
	    
 public void getListOfLibraryemployee()
	    
	    {
	    Map<String, String> libraImp = new HashMap<>();

        // Adding key-value pairs to the map
	    libraImp.put("Manager", "Alex  michael");
	    libraImp.put("supervisor", "marcos bruck");
	    libraImp.put("regular worker", "paule chrisano");
	    libraImp.put("regular worker", "zemzam Ahmed");

     

        // Iterating over the map
        for (Map.Entry<String, String> entry : libraImp.entrySet()) {
             entry.getKey();
            entry.getValue();
            System.out.println(entry.getKey()+"     " + entry.getValue());
	    	
	    	
        }

}
}
