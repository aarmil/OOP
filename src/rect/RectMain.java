package rect;

public class RectMain {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.setDimensRect(5,5);
        double perimeter = rect.perimeter();
        double square = rect.square();
        System.out.println("Perimeter = " + perimeter + ".\nSquare = " + square + ".");
    }
}
