package chapterFourteen;

public class StringObject {

    public static void main(String[] args) {

        String name = "Tinu";
        System.out.println("Name: " + name);
        String nativeName = name;
        System.out.println("Native Name: " + nativeName);
        nativeName = "Obele";
        name = "Toyin";

        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Native Name: " + nativeName);

        System.out.println(name.equals(nativeName));
        System.out.println(name == nativeName);

    }
}
