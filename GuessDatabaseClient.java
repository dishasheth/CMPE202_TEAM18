import org.json.JSONArray;
import org.json.JSONObject;
import org.restlet.data.Form;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

/**
 * Creates and launches a HTTP client invoking the server listening on port
 * 8080, and writing the response entity on the console.
 */

public class GuessDatabaseClient {
	private static String service_url = "http://localhost:8088/restlet/guessit/database";

	public static void main(String[] args) throws Exception {
		ClientResource guessDatabaseResource = new ClientResource(service_url);
		// Representation result = guessDatabaseResource.get();
		Form form = new Form();
		form.add("moves", "sortitout");
		form.add("level", "Easy");
		form.add("gameName", "newGame123");

		 //Representation result = guessDatabaseResource.get();
	// JsonRepresentation newResult = new JsonRepresentation(result);
		// System.out.println(newResult);
		//Representation result2 = guessDatabaseResource.get();
		// new JsonRepresentation(result2);
		Representation newResult2 = guessDatabaseResource.get();
		System.out.println(newResult2);
		
		
		String order_string = newResult2.getText(); 
	  	
		  System.out.println("INPUT"+order_string);
		  
		  
		      JSONObject json = new JSONObject(order_string) ;
		      JSONArray json_arr = json.getJSONArray("items");
		      
		      for (int i=0;i<json_arr.length();i++)
		      {
		    	  System.out.println(((JSONObject)json_arr.getJSONObject(i).get("Moves")).get("s"));
		      }
	}

}
