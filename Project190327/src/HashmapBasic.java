/*
 *	Simple example of "HASHMAP IN JAVA"
 */



import java.util.HashMap;
import java.util.Map;

public class HashmapBasic {

	public static void main(String[] args) {
		
		Map <String, String> mp = new HashMap<String, String>();
		
		mp.put("firstName", "Abhi");
		mp.put("empCode", "1678");
		mp.put("lastName", "Sapkal");
		mp.put("designation", "QA");
		
		
/*
		mp.put("d", "a");
		mp.put("b", "d");

		mp.put("C", "5");
		mp.put("A", "c");
*/
		

//#     VARIOUS METHODS OF HASHMAP CLASS:
		
		
//		=> Assign Key-Value pair to Hash map object.
			
		mp.put("key", "value");
	
		
//		=> Print entire map Key-Value pairs

		System.out.println(mp);
		
				
//		=> Get the value of key and print it.
		
		System.out.println(mp.get("empCode"));
		
		
//		=> Check whether Key is assigned to map object.	(returns boolean value)	
		
		mp.containsKey("lastName");  
	

//		=> Check whether Value is assigned to map object. (returns boolean value)	

		mp.containsValue("QA");  


//		=> Remove specific Key-Value pair from map object.

		mp.remove("empCode");
		
//      => Delete all Key-Value pair from map object.
		
		mp.clear();
				
	
		
	}

}
