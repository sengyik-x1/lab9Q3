import java.lang.*;
// The task for printing a specified character in specified times
class PrintChar implements Runnable
{
  private char charToPrint; // The character to print
  private int times; // The times to repeat

  /** Construct a task with specified character and number of
   *  times to print the character
   */
  public PrintChar(char c, int t)
  {
    charToPrint = c;
    times = t;
  }

  public void run()
  {
    for (int i = 0; i < times; i++)
    {
      System.out.print(charToPrint);
      try{
      Thread.sleep(300);
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}