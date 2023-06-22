package Algorithm;

public class StringB {

    public static void main(String[] args) {

        StringBuilder builder1 = new StringBuilder();
        builder1.append(2 + "  ");
//        builder1.append("he" + "  ");
//        builder1.append(2.8 + "  ");
        System.out.println("Builder 1 Content -> " + builder1);
        System.out.println("Builder 1 Length -> " + builder1.length());
        System.out.println();

        StringBuilder builder2 = new StringBuilder(5);
        builder2.append("7" + "  ");
        builder2.append("helo" + "  ");
        builder2.append(2.0 + "  ");
        builder2.append(true + "  ");
        builder2.append("array" + "  ");
        builder2.append(3 + "  ");
        builder2.append(89 + "  ");

        System.out.println("Builder 2 Content -> " + builder2);
        System.out.println("Builder 2 Length -> " + builder2.length());
        System.out.println();

        String sen = "gee";
//        String[] array = sen.split(".");

        StringBuilder builder3 = new StringBuilder("Goat");


//        System.out.println(builder3);




    }
}
