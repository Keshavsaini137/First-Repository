class start
{
   public void hello()
   {
   System.out.println(" it's ");
   }
}

class hello
{
    void hello()
    {
      System.out.println("Hello World");  
    }
    //System.out.println("Hello World");
    
    public static void main(String args [])
    {
        hello a = new hello();
        a.hello();
        start any = new start();
        any.hello();
        
        System.out.println("Keshav ");
        
    }
}