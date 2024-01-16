public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    //String s="Hello World";
    //String s="One two tHRee world";
    //System.out.println(capVowelsLowRest(s));        
    //System.out.println(camelCase (s));
    //String string="Hello world";
    //char chr='l';
    //System.out.println(allIndexOf (string, chr));

    }

    public static String capVowelsLowRest (String string) { //why doesnt it work when the first char is an uppercase vowel?
        // Write your code here:
        String answer="";
        for(int i=0;i<string.length(); i++)
        {
            if((string.charAt(i)=='a') || (string.charAt(i)=='e') || (string.charAt(i)=='i') || (string.charAt(i)=='o') || (string.charAt(i)=='u'))
            {
                if((string.charAt(i)>=(char)65) && (string.charAt(i)<=(char)90)) //not uppercase
                {
                    answer+=string.charAt(i);
                }
                else
                {
                    answer+=(char)(string.charAt(i)-32);
                }
            }
            else
            {
                if((string.charAt(i)>=(char)65) && (string.charAt(i)<=(char)95))
                {
                    answer+=(char)(string.charAt(i)+32);
                }
                else
                {
                    answer+=string.charAt(i);
                }
            }    
        }        

        return answer;
    }

    public static String camelCase (String string) { //do help functions
        // Write your code here:
        String answer="";
        int i=0;
        
            while(string.charAt(i)!=(char)32 && i<string.length())
            {
                
                if(string.charAt(i)<=(char)65 && string.charAt(i)>=(char)90)
                {
                    answer+=(char)(string.charAt(i)+32);
                }
                else
                {
                    answer+=string.charAt(i);
                }
                i++; 
            }
            
            i--;
            while(i<string.length())
            {
                i++;
                while(string.charAt(i)==(char)32 && i<string.length())
                {
                    i++;
                }

                if(string.charAt(i)>(char)90 && i<string.length())
                    {
                        answer+=(char)(string.charAt(i)-32);
                    }
                else
                {
                    if(i<string.length())
                    {
                        answer+=string.charAt(i);
                    }
                }
                

                while(string.charAt(i)!=32 && i<string.length())
                {
                    if(string.charAt(i)>=(char)65 && string.charAt(i)<=(char)90)
                    {
                        answer+=(char)(string.charAt(i)+32);
                    }
                    else
                    {
                        answer+=string.charAt(i);
                    }
                    i++;
                }
            }
            
        return answer;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
         //setting an empty array of the length of the string
        int size=0;
        for(int j=0;j<string.length();j++)
        {
            if(string.charAt(j)==chr)
            {
                size++;
            }
        }
        int array[]=new int[size];
        int n=0;
        for(int i=0; i<string.length(); i++)
        {
            if(string.charAt(i)==chr)
            {
                array[n]=i;
                n++;
            }
        }
        return array;
    }
}
