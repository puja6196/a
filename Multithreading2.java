
import java.util.logging.Level;
import java.util.logging.Logger;

class A1 extends Thread
{
    public void run()
    {
    for(int i=0;i<10;i++)
    {
        try {
            System.out.println("Thread A1");
            sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(A1.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    }

}
public class Multithreading2
{
    public static void main(String[] args)
    {
    A1 a1=new A1();
    a1.start();
    
    }
            
            
    
}
