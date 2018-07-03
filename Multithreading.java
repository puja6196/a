
package multithreading;
class Alpha extends Thread
{
    public void run()
    {
    for(int i=0;i<5;i++)
      {
          System.out.println("from thread alpha"+i);
      }
    System.out.println("exit from alpha");
    }
    

}
class Beta extends Thread
{
    public void run()
    {
    for(int i=0;i<5;i++)
      {
          System.out.println("from thread beta"+i);
      }
    System.out.println("exit from beta");
    }
    

}
class Gamma extends Thread
{
    public void run()
    {
    for(int i=0;i<5;i++)
      {
          System.out.println("from thread gamma"+i);
      }
    System.out.println("exit from gamma");
    }
    

}

public class Multithreading 
{
   public static void main(String[] args)
    {
       Alpha alpha=new Alpha();
       Beta beta=new Beta();
       Gamma gamma=new Gamma();
       alpha.start();
       beta.start();
       gamma.start();
       
       
    }
    
}
