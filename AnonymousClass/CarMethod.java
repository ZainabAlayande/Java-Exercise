package AnonymousClass;

@FunctionalInterface
public interface CarMethod {
     void stop(String name);

     default void move() {
          System.out.println("Move");
     }

     static void zee() {
          System.out.println("Zee");
     }



}
