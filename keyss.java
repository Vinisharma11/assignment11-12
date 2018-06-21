import java.util.*;  
class keyss{  
  public static void main(String args[]) {  
  HashMap<String,String> m= new HashMap<String,String>();  
  m.put("First", "Vinita");
  m.put("Second", "Neel");
  m.put("Third", "Aditi");
  m.put("Fourth", "Rohit");
  m.put("Fifth", "Sriom");
  for(Map.Entry<String,String> entry:m.entrySet()){  
   System.out.println(entry.getKey()+" : "+entry.getValue());
  }
  System.out.println();
  for(Map.Entry<String,String> entry:m.entrySet()){
   System.out.println(entry.getKey());   
     
  }  
 }  
}