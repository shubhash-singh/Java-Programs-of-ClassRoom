package Threads;

class MyThread extends Thread {
    public void run()
    {
        for (int i=0;i<10;i++)
            System.out.println("i="+i);
    }
}

public class MyThread_by_inheriting_ThreadClass 
{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}