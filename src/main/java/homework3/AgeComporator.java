package homework3;

import java.util.Comparator;

public class AgeComporator implements Comparator<Employee> {


@Override
public int compare(Employee o1,Employee o2){

       // return int.compare(o1.getAge(), o2.getAge());

        return o1.getAge() == o2.getAge() ? 0 :
                o1.getAge() > o2.getAge() ? 1 : -1;
        }

}
