package rect;

public class Rect {
    private double lenght;
    private double width;

    public void setDimensRect(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double perimeter() {
       return lenght * 2 + width * 2;
    }

    public double square() {
        return lenght * width;
    }
}

