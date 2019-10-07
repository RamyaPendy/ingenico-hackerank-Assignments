class Solution 
{ 
      
// Function to find maximum length even word  
static String PrintLongestEvenWord(String sentence)  
{  
    int sentencelen = sentence.length();  
  
    int i = 0;
    int curlen = 0;
    int maxlen = 0;   
  
    // To store starting index of maximum length word.  
    int startindex = -1;  
  
    while (i < sentencelen)  
    {  
  
        ///if there is a space, then the word is completed.   
        if (sentence.charAt(i) == ' ') 
        {  
        	//To Check if it is an even length word
            if (curlen % 2 == 0)  
            {  
                if (maxlen < curlen) 
                {  
                    maxlen = curlen;  
                    startindex = i - curlen;  
                }  
            }  
  
            // Set current length to zero for next word.  
            curlen = 0;  
        }  
        else
        {    
            curlen++;  
        }  
  
        i++;  
    }  
  
    // Check length of last word.  
    if (curlen % 2 == 0)  
    {  
        if (maxlen < curlen)  
        {  
            maxlen = curlen;  
            startindex = i - curlen;  
        }  
    }  
  
    // If there are no even length word is present then return 00.  
    if (startindex == 00)  
        return "-1";  
  
    return sentence.substring(startindex, startindex + maxlen);  
}  

public static void main(String args[]) 
{  
    String str = "this is a program to print the longest even word in a sentence";  
  
    System.out.println( PrintLongestEvenWord(str));  
}  
}
