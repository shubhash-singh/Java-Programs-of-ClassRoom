/*
 * 1. Create a class that implements Runnable interface
 * 2. Override the run() method with the code that is to be executed
 * 3. Create the object of the newly created class
 * 4. Create the Thread class object by passing above created object as parameter
 * 5. Call the start () method on the tread class object.
 */

package Threads;

class ThreadExample implements Runnable
{
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("i="+i);
        }
    }
}
public class Thread_by_Implementing_Runnable_interface {
    public static void main(String[] args) {
        ThreadExample th = new ThreadExample();
        Thread t = new Thread(th);
        t.start();
    }
}
