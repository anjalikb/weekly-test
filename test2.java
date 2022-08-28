/*Q2. Write a Java program to find the length of the longest consecutive
elements sequence from a given unsorted array of integers.
 Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
 The longest consecutive elements sequence is [1, 2, 3, 4, 5],
therefore the program will return its length 5 */

class test2
{
    public static void main(String args[])
     {
          int a[]={49, 1, 3, 200, 2, 4, 70, 5};
 
            int i,j,temp;
          for(i=0;i<a.length;i++)
            {
                for(j=i+1;j<a.length;j++)
                  {
                        if(a[i]>a[j])
                        {
                            temp=a[j];
                            a[j]=a[i];
                            a[i]=temp;
                         }
                    }
             }
            
            System.out.println("longest consecutive sequence is");
            {
                for(i=0;i<5;i++)
                {
                      System.out.println(a[i]);
                }
            }
       }
}