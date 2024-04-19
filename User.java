package libraryProjectToBeSubmitted;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	  private String name;

	   
	    public String getListOfusers()
	    
	    {
	    	List<String> us = new ArrayList<>();
	    	us.add("james steven");
	    	us.add("Robert paul");
	    	us.add("johon joshua");
	    	us.add("Michael Timoty");
	    	us.add("David elzabeth");
	    	us.add("sara thomas");
	    	us.add("lisa charles");
	    	us.add(" sandra antony");
	    	us.add("betty mattew");
	    	us.forEach(name->System.out.println(name));
	    	return "Margareta mark";
	    	
	    }

}
