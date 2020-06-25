package box;

public class Box {
    private double width;
    private double height;
    private double lenght;

    public Box(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    public Box(double size) {
        width = size;
        height = size;
        lenght = size;
    }

    public Box() {
        width = 0;
        lenght = 0;
        height = 0;
    }

    public Box(Box box) {
        width = box.width;
        lenght = box.lenght;
        height = box.height;
    }

    //Creating box which volume is bigger then volume of 2 object boxes
    public Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.lenght = box1.lenght + box2.lenght;
        this.height = box1.height + box2.height;
    }

    public void setDimens(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    public Box increase(int i) {
        return new Box(width * i, height * i, lenght * i);
    }

    public double Volume() {
        return width * height * lenght;
    }

    public void showVolume() {
        System.out.println(Volume());
    }

    public int compare(Box box) {
        double thisVolume = Volume();
        double boxVolume = box.Volume();
        if (thisVolume > boxVolume) {
            return 1;
        } else if (thisVolume < boxVolume) {
            return -1;
        } else {
            return 0;
        }
    }

    public Box sumParameter(Box box) {
        Box boxNew = new Box();
        boxNew.width = width + box.width;
        boxNew.lenght = lenght + box.lenght;
        boxNew.height = height + box.height;
        return boxNew;
    }

    public void showDimens() {
        System.out.println("Width is " + width + ".\nHeight is " + height + ".\nLenght is " + lenght + ".");
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLenght() {
        return lenght;
    }
}
