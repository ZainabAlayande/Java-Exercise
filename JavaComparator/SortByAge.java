package JavaComparator;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {

    @Override
    public int compare(Student objectOne, Student objectTwo) {
        return Integer.compare(objectOne.getAge(), objectTwo.getAge());
    }
}
