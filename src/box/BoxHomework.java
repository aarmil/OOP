package box;

import box.Box;

public class BoxHomework {
    public static void main(String[] args) {

        Box box = new Box(2,3,5);
        Box box2 = new Box(2);
        Box box3 = box.sumParameter(box2);
        box3.showDimens();
        Box box4 = new Box(box,box2);
        double volumeSum = box.Volume() + box2.Volume();
        System.out.println("Sum of box and box2 volumes = " + volumeSum + ".");
        System.out.println("Volume of box4 = " + box4.Volume() + ".");
    }
}
