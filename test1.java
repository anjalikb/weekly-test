/* Write a Java program to move all 0's to the end of an array.
 Maintain the relative order of the other (non-zero) array elements.*/
 
class test1
{
   public static void main(String args[])
    {
          int a[]={1,0,4,0,5,0,2,0,6,0,7,4,0,0};

              int i,j,temp;
              
            for(i=0;i<a.length;i++)
             {
                  for(j=i+1;j<a.length;j++)
                  {
                        if(a[i]==0)
                       {
                           temp=a[j];
                           a[j]=a[i];
                           a[i]=temp;
                       }
                   }
              }
            
               System.out.println("move all zero end of the array");
               for(i=0;i<a.length;i++)
              {
                 System.out.println(a[i]);
              }
      }
}