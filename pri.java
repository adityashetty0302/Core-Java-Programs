package Task2;

import java.util.*;

public class pri {

public static void main(String[] args)
{

PriorityQueue<Double> ar= new PriorityQueue<Double>();
ar.add(34.23);
ar.add(24.89);
ar.add(90.87);
ar.add(55.67);
ar.add(34.23);
// Iterator class object can traverse through the list in iterative process
System.out.println("The top element now is :"+ ar.peek());
System.out.println("The elements in the queue are:");
Iterator itr = ar.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

ar.remove();// it will remove the top element

System.out.println("The elements in the queue after deletion are:");
Iterator itr2 = ar.iterator();
while(itr2.hasNext())
{
System.out.println(itr2.next());
}

}

}

