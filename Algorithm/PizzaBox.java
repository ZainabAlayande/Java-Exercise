package Algorithm;

public class PizzaBox {

    int totalBoxOfPizza;
    int numberOfPiecesLeft;

    public int getTotalBoxOfPizza() {
        return totalBoxOfPizza;
    }

    public void setTotalBoxOfPizza(int totalBoxOfPizza) {
        this.totalBoxOfPizza = totalBoxOfPizza;
    }

    public int getNumberOfPiecesLeft() {
        return numberOfPiecesLeft;
    }

    public void setNumberOfPiecesLeft(int numberOfPiecesLeft) {
        this.numberOfPiecesLeft = numberOfPiecesLeft;
    }

    public PizzaBox calculatePizzaBox(int numberOfPeople, int minimum, int maximum) {
        int oneBox = 6;
        int numberOfPeopleThatWantOneSliceOfPizza = numberOfPeople - (maximum + minimum);
        int minimumSatisfaction = minimum * 2;
        int maximumSatisfaction = maximum * 3;
        int result = minimumSatisfaction + maximumSatisfaction + numberOfPeopleThatWantOneSliceOfPizza;
        numberOfPiecesLeft = result % oneBox;
        totalBoxOfPizza = result/oneBox;
        System.out.println(totalBoxOfPizza);
        System.out.println(numberOfPiecesLeft);

        // TODO: 4/12/2023 The total number of pizza that will satisfy the people
        // TODO: 4/12/2023 the number of pieces that will be left 5, 2, 2
        return new PizzaBox();
    }

    @Override
    public String toString() {
        return "PizzaBox{" +
                "totalBoxOfPizzaThatWillSatisfyThePeople=" + totalBoxOfPizza +
                ", numberOfPiecesLeft=" + numberOfPiecesLeft +
                '}';
    }

    public static void main(String[] args) {
        PizzaBox pizzaBox = new PizzaBox();
        System.out.println(pizzaBox.calculatePizzaBox(10, 3, 4));
    }
}
