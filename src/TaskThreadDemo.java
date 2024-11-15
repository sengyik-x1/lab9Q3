import java.lang.*;

public class TaskThreadDemo
{
  public static void main(String[] args)
  {
    // Create tasks
    Runnable printA = new PrintChar('a', 100);
    Runnable printB = new PrintChar('b', 100);
    Runnable print100 = new PrintNum(100);

    // Create threads
    Thread thread1 = new Thread(printA);
    Thread thread2 = new Thread(printB);
    Thread thread3 = new Thread(print100);


    thread3.setPriority(6);
    // Start threads
    try{
      thread3.join();

    }catch(Exception e){
      e.printStackTrace();
    }
    thread3.start();
    thread1.start();
    thread2.start();
    //thread3.start();
    

    System.out.println(thread1.getPriority());
    System.out.println(thread2.getPriority());
    System.out.println(thread3.getPriority());
    
  }
}
