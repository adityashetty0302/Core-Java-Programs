package Task2;

import java.util.*;

public class treeset {

public static void main(String[] args)
{

TreeSet<Double> ar= new TreeSet<Double>();
ar.add(34.23);
ar.add(24.89);
ar.add(90.87);
ar.add(55.67);
ar.add(34.23);
// Iterator class object can traverse through the list in iterative process
Iterator itr = ar.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

}

}