public class Box {
    double width;
    double height;
    double lenght;

    public Box(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    void setDimens(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    double Volume() {
        return width * height * lenght;
    }
}
