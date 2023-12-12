package Threads;


public class MainTHread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread is :"+t.getName());
        t.setName("Shubahsh");
        System.out.println("After name Change: "+t.getName());
        System.out.println("Main Thread Priority: "+t.getPriority());
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Main Thread new Priority: "+t.getPriority());

        for (int i=0;i<3;i++)
        {
            System.out.println("Main Thread");
        }

        // Main Thread creating a child thread
        ChildTHread ct = new ChildTHread();
        System.out.println("Child thread priority = "+ct.getPriority());
        ct.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Child Thread new priority : " +ct.getPriority());
        ct.start();
    }
}

class ChildTHread extends Thread
{
    public void run()
    {
        for (int i=0;i<3;i++)
        System.out.println("Child Thread");
    }
}
