//overloading

class xyz1
{
      public void disp(int a,int b)
     {
        System.out.println(a+b);
      }

      public void disp(char a)
    {
        System.out.println(a);
     }

      public void disp(double a,double b)
     {
         System.out.println(a+b);
      }

     public static void main(String args[])
     {
          xyz1 ob=new xyz1();
           ob.disp(3,4);
           ob.disp('a');
           ob.disp(3.4,8.6);
    }
}

           


