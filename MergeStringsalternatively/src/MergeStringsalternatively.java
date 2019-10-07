
public class MergeStringsalternatively { 
  
    // Function for alternatively merging two strings 
    public static String merge(String s1, String s2) 
    { 
        // To store result 
        StringBuilder result = new StringBuilder(); 
   
        for (int i = 0; i < s1.length() || i < s2.length(); i++) { 
  
        	//If the first string exists
            if (i < s1.length()) 
                result.append(s1.charAt(i)); 
  
            // If the second string exists 
            if (i < s2.length()) 
                result.append(s2.charAt(i)); 
        } 
  
        return result.toString(); 
    } 
  
     
    public static void main(String[] args) 
    { 
        String s1 = "hackerank"; 
        String s2 = "assignment"; 
        System.out.println(merge(s1, s2)); 
    } 
}
