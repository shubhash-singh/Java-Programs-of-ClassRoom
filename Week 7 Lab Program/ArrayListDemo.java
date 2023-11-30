/*
 * ArrayList:
 *      Arraylist class is resiziable array which can be found in java.util package
 */

import java.util.*;
import java.util.ArrayList;

class ArrayListDemo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> array = new ArrayList <String>();

        array.add("BMW");
        array.add("Shubhash");
        array.add("Nisha");
        Collections.sort(array);
        sc.close();
        for (String i :array)
        {
            System.out.println(i);
        }
    }
}
