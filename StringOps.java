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
    //System.out.println(capVowelsLowRest (s));        
    //System.out.println(camelCase (s));
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String answer="";
        for(int i=0;i<string.length(); i++)
        {
            if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u')
            {
                if(string.charAt(i)>(char)90) //not uppercase
                {
                    answer+=(char)(string.charAt(i)-32);
                }
                else
                {
                    answer+=string.charAt(i);
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

    public static String camelCase (String string) {
        // Write your code here:
        String answer="";
        int i=0;
        
            while(string.charAt(i)!=(char)32 && i<string.length())
            {
                if(string.charAt(i)<=65 && string.charAt(i)>=90)
                {
                    answer+=(char)(string.charAt(i)+32);
                }
                else
                {
                    answer+=string.charAt(i);
                }
                i++;
            }

            while(i<string.length())
            {
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
                i++;

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
        return new int[1];
    }
}
