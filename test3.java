/*Write a Java program to get the majority element from a given
array of integers containing duplicates.
 Majority element: A majority element is an element that appears
more than n/2 times where n is the size of the array.*/

class test3
{
      public static void main(String args[])
      {
            int a[]={3,3,2,3,1,5,3};
             int n=a.length;
              int maxc=0;
              int lock=-1;
              int c=0;
              for(int i=0;i<n;i++)
                {
                   for(int j=i+1;j<n;j++)
                     {
                         if(a[i]==a[j])
                           {
                                c++;
                            }
                            if(c>maxc)
                            {
                               maxc=c;
                               lock=i;
                            }
                      }
                        if(maxc>n/2)
                          {
                               System.out.println(a[lock]);
                           }
                         else
                          {
                                System.out.println("no majority elements");
                           }
                 }
          }
}
                      
