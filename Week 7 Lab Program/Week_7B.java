//ArrayList Implementation
import java.util.ArrayList;
import java.util.*;
class employee
{
    int id;
    String Name;
    double salary;
    public employee(int id, String Name, double salary)
    {
        this.id = id;
        this.Name = Name;
        this.salary = salary;
    }
}

public class Week_7B {
    public static void main(String[] args) {
        ArrayList<employee> list = new ArrayList<employee>();
        list.add(new employee(101, "Shubhsh", 59000));
        list.add(new employee(102, "Nisha", 69000));
        list.add(new employee(103, "Aadarsh", 50000));
        Collections.sort(list,(p1,p2)->{
            return p1.Name.compareTo(p2.Name);
        });
        for (employee elem :list)
        {
            System.out.printf("ID: %d   Name: %s   Salary: %f\n",elem.id,elem.Name, elem.salary);
        }
    }
}
