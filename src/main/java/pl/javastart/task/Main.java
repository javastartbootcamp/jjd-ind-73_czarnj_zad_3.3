package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        MathResolver mr = new MathResolver();
        int a = 3;
        double b = 2.5;
        System.out.printf("%d is even: %b\n", a, mr.isEven(a));
        System.out.printf("%d is odd: %b\n", a, mr.isOdd(a));
        System.out.printf("Power of %d is: %d\n", a, mr.power(a));
        System.out.printf("Circle's field for radius %.2f: %.2f\n", b, mr.circleField(b));
    }
}
