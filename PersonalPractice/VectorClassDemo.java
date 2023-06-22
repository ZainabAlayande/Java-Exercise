package PersonalPractice;

import java.util.Vector;

public class VectorClassDemo {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>(3, 2);

        vector.addElement(23);
        vector.addElement(12);
        vector.addElement(2);
        vector.addElement(89);
        vector.addElement(19);

        System.out.println(vector);

    }
}
