package AnonymousClass;

public class Main {

    public static void main(String[] args) {
        Toyota toyota = new Toyota();

        CarMethod carMethodTwo = (name) -> System.out.println("Stop");

        CarMethod carMethod = new CarMethod() {

            @Override
            public void stop(String name) {

            }

            @Override
            public void move() {
                System.out.println("Stop");
            }

//            @Override
//            public void stop() {
//                System.out.println("Move");
//            }
        };

        toyota.move(carMethod);
        toyota.stop(carMethod);

        carMethod.stop("Wao");
    }
}
