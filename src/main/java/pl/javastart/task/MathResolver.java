package pl.javastart.task;

public class MathResolver {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public double circleField(double radius) {
        return Math.PI * radius * radius;
    }

    public int power(int number) {
        return number * number;
    }
}
