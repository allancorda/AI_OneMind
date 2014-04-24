/*
    This is for AI to work as one using a contr
 */

package ais_onemind;

/**
 *
 * @author Allan Corda
 */
public class AIs_OneMind implements Runnable{
    private Thread t;
    private String threadName;
    
    AIs_OneMind (String name){
        this.threadName = name;
        System.out.println("Creating " + threadName + ". Time " + System.currentTimeMillis());
    }
    
   // Is Alive State.
   public void run() {
      System.out.println("Running " +  threadName  + ". Time " + System.currentTimeMillis());
      try {
         int i = 0;
         while(i != 30) {
            i++;
            System.out.println("Must Work: " + threadName);
            System.out.println("i = "+i);
            System.out.println("Fallen Asleep");
            Thread.sleep(50);
            System.out.println("Woke up");
            
         }
     } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted. Time " + System.currentTimeMillis());
     }
      //Need to Call Dead State.
     System.out.println("Thread " +  threadName + " exiting. Time " + System.currentTimeMillis());
   }
   
   public void start ()
   {
       //Spawn State
      System.out.println("Starting " +  threadName );
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Starting one mind.");
        AIs_OneMind ai = new AIs_OneMind("Allan");
        //Thread thread = new Thread(ai);
        AIs_OneMind ai2 = new AIs_OneMind("Kyle");
        Thread thread2 = new Thread(ai2);
        ai.start();
        thread2.start();
    }
    
}
