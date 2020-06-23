public class Rect {
    double lenght;
    double width;

    void setDimensRect(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    double perimeter() {
       return lenght * 2 + width * 2;
    }

    double square() {
        return lenght * width;
    }
}

