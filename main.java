//overriding is a example of dynamic polymorphism

class parent1
{
     void disp()
    {
         System.out.println("this is parent class");
    }
    public void disp2()
   {
      System.out.println("i am learn overriding");
   }
}

class abc extends parent1
  {
      void disp()
    {
       
       System.out.println("this is child class");
       super.disp();
    }
}
  class main{

   public static void main(String args[])
   {
      abc ob=new abc();
      ob.disp();
      ob.disp2();
      
   }
 }
   
 