
//Java HashMap add() elements
//Java HashMap remove() elements
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	    System.out.println("Initial list of elements: "+hm);  
	      hm.put(100,"Karthikn");    
	      hm.put(101,"Aadhi");    
	      hm.put(102,"Rahul");   
	       
	      System.out.println("After invoking put() method ");  
	      for(Entry<Integer, String> m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	        
	      hm.putIfAbsent(103, "dhuru");  
	      System.out.println("After invoking putIfAbsent() method ");  
	      for(Map.Entry m:hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  
	      HashMap<Integer,String> map=new HashMap<Integer,String>();  
	      map.put(104,"Ravi");  
	      map.putAll(hm);
	      map.remove(100);
	      System.out.println("After invoking putAll() method and remove() method ");  
	      for(Map.Entry m:map.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }
	      System.out.println("Updated list of elements");
	     map.replace(103,"dhuru","naveen");
	      for(Map.Entry m:map.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }
	      

	}

}
