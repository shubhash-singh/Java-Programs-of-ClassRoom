import java.util.*;

public class Stack_implementation {
    static int s_top = -1;
    static int max_length = 5;
    static int[] Stack = new int[max_length];
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        
        int i =0;
        int choice = 0;
        while(i==0)
        {
            System.out.println("*******Menu*******");
            System.out.println("1.Push new element");
            System.out.println("2.Pop an element");
            System.out.println("3.Display");
            System.out.println("4.Stop");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    push_element();
                    break;
                case 2:
                    pop_element();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    i = 1;
                    break;
                default:
                    System.out.println("Invalid Choice\n\n");
                    break;
            }
        }  
        sc.close();
    }
    static void push_element()
    {
        if (s_top == max_length-1)
        {
            System.out.println("Stack Overflow\n\n");
        }
        else
        {
            System.out.println("Enter the element");
            int element = sc.nextInt();
            Stack[s_top+1] = element;
            s_top++;
        }
        
    }

    static void pop_element()
    {
        if (s_top == -1)
        {
            System.out.println("Stack Underflow");
        }
        else{
            s_top--;
        }
    }

    static void display()
    {
        if (s_top != -1)
        {
            for (int i=0;i<s_top;i++)
            {
                System.out.println(Stack[i]);
            }
        }
        else
            System.out.println("Stack is Empty");
    }
}