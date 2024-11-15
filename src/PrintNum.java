import java.lang.*;
// The task class for printing number from 1 to n for a given n
class PrintNum implements Runnable
{
  private int lastNum;

  /** Construct a task for printing 1, 2, ... i */
  public PrintNum(int n)
  {
    lastNum = n;
  }

  public void run()
  {
    Thread thread4 = new Thread(new PrintChar('c', 100));
    //thread4.start();
    for (int i = 1; i <= lastNum; i++)
    {
      System.out.print(i);
      //Thread.yield();
      // try{
      //   if(i>=50){
      //     Thread.sleep(300);
      //   }
      // }catch(InterruptedException ex){}
    // //Thread.yield();
    }
  }
}