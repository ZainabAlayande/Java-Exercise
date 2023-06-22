package JavaComparator;

import java.util.*;

public class StudentDriver {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student studentOne = new Student("Zainab", 78);
        Student studentTwo = new Student("Aliyah", 30);
        Student studentThree = new Student("Michael", 78);
        Student studentFour = new Student("Prof", 23);
        Student studentFive = new Student("Tayo", 56);

        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);
        students.add(studentFour);
        students.add(studentFive);

        Comparator<Student> comparator = Comparator.comparing(Student::getAge)
                .thenComparing(Student::getName);

        Collections.sort(students, comparator);
        System.out.println(students);

//        for (int i = 0; i < students.size(); i++) {
//            System.out.println(students.get(i));
//        }

    }



}
