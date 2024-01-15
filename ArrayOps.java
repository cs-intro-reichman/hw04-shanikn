public class ArrayOps {
    public static void main(String[] args) {
        //int[] array={0,1,3,4,5};
        //System.out.println(findMissingInt(array));
        // System.out.println(secondMaxValue(array));
        //int [] array2={3,-4,1,2,5};
        //int [] array1={1,3,-4,5};
        //System.out.println(containsTheSameElements(array1,array2));
        int [] array={1,1,1,2,2};
        System.out.println(isSorted(array));
    }
    
    //returns the missing integer in the array, between 0 and the array length
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int sumArray=0;
        int supposedSumArray=0;
        int missing=0;


        for(int i=1;i<=array.length;i++)
        {
            supposedSumArray+=i;
        }

        for(int j=0;j<array.length;j++)
        {
            sumArray+=array[j];
        }

        missing=supposedSumArray-sumArray;
        return missing;
    }


    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max=array[0];
        int tempI=0;
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
                tempI=i;
            }
        }
        int max1=array[0];
        for(int j=0;j<array.length;j++)
        {
            if(array[j]==max && j!=tempI)
            {
                max1=array[j];
                j=array.length;
            }
            if(array[j]>max1 && array[j]!=max)
            {
                max1=array[j];
            }
        }
        return max1;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        boolean sameElements=true;
        for(int i=0; i<array1.length; i++)
        {
            for(int j=0; j<array2.length; j++)
            {
                if(array1[i]==array2[j])
                {
                    sameElements=true;
                    j=array2.length;
                }
                else
                {
                    sameElements=false;
                }
            }
            
            if(sameElements==false)
            {
                break;
            }
        }

        for(int i=0; i<array2.length; i++)
        {
            for(int j=0; j<array1.length; j++)
            {
                if(array2[i]==array1[j])
                {
                    sameElements=true;
                    j=array1.length;
                }
                else
                {
                    sameElements=false;
                }
            }
            
            if(sameElements==false)
            {
                break;
            }
        }
        return sameElements;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        boolean sorted=true;
        for(int i=1; i<array.length;i++)
        {
            if(array[i]==array[i-1])
            {  
                sorted=false;
            }
            else
            {
                sorted=true;
                if(array[i]>array[i-1])
                {
                    for(int j=i+1;j<array.length;j++)
                    {
                        if(array[j]>=array[j-1]) //&&array
                        {
                            sorted=true;
                        }
                        else
                        {
                          sorted=false;
                          j=array.length;//break;
                          i=array.length;
                        }
                    }
                }
                else
                {   
                    for(int n=i+1; n<array.length; n++)
                    {
                        if(array[n]<=array[n-1]) //&&array
                        {
                            sorted=true;
                        }
                        else
                        {
                            sorted=false;
                            n=array.length;//break;
                            i=array.length;
                        }
                    }
                }
                
            }
        }
        
        return sorted;
    }

}
