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
    String s="Hello World";
    //String s="One two tHRee world";
    //System.out.println(capVowelsLowRest(s));        
    System.out.println(camelCase (s));
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

    public static boolean Cap(char c) //returns true if a char is uppercase
    {
        return c>='A' && c<='Z';
    }

    public static char upCase(char s) // returns an uppercase version of char 
    {
        if(s>='a' && s<='z')
        {
            return (char)(s-'a' + 'A');
        }
        else
        {
            return s;
        }
    }

    public static char lowerCase(char s) // returns a lowercase version of char
    {
        if(s>='A' && s<='Z')
        {
            return (char)(s-'A'+'a');
        }
        else
        {
            return s;
        }
    }

    public static String camelCase (String string) { 
        // Write your code here:
        String answer="";
        boolean cap=false;
        boolean first=false;

        for(int i=0; i<string.length(); i++)
        {
            if(!first && string.charAt(i)!=' ')
            {
                answer+=(lowerCase(string.charAt(i)));
                first=true;
                cap=false;
                continue;
            }

            if(cap && string.charAt(i)!=' ')
            {
                answer+= upCase(string.charAt(i));
                cap=false;
            }
            else
            {
                if(string.charAt(i)!= ' ' && !cap) 
                {
                    answer+= lowerCase(string.charAt(i));
                }
            }
            if(string.charAt(i)==' ')
            cap=true;
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
