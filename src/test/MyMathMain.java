package test;

public class MyMathMain {
    public static void main(String[] args) {
        int square = MyMath.square(20);
        System.out.println(square);

        double lenght = MyMath.lenght(10);
        System.out.println(lenght);

        double area = MyMath.area(10);
        System.out.println(area);

        lenght = MyMath.lenght(10);
        System.out.println(lenght);

        int sum = MyMath.sum(1, 3);
        System.out.println(sum);
    }
}
