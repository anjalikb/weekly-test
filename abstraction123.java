//example of abstraction
abstract class book
{
     abstract void input();
     abstract void disp(int a,int b);
     abstract void disp2();

     divya()
     {
        System.out.println("this is constructor");
     }
}

class pen extends book
{
    public void input()
    {
      System.out.println("i am overriding");
    }
    
    public void disp(int a,int b)
    {
        System.out.println("addition of two no"+(a+b));
    }

   public void disp2()
    {
        System.out.println("i am child class");
    }
}

class abstraction123
  {
      public static void main(String args[])
     {
        pranjali ob=new pranjali();
        ob.input();
        ob.disp(3,4);
        ob.disp2();
     }
  }


      
    

 

