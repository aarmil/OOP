public class Main {
    public static void main(String[] args) {
        //Trying overload
        Box box = new Box(10, 15, 20);
        System.out.println(box.Volume());
        Box box2 = new Box(11,6, 3);
        System.out.println(box2.Volume());
        Box box3 = new Box(10);
        box3.showVolume();
        Box box4 = new Box();
        box4.showVolume();

        //Using object as method parameter
        int result = box.compare(box2);
        switch (result) {
            case -1:
                System.out.println("Our box is less");
                break;
            case 0:
                System.out.println("Boxes are equal");
                break;
            case 1:
                System.out.println("Our box is bigger");
                break;
        }

        //Using construct - object in object
        Box box5 = new Box(box3);
        //Boxes has same parameters but they are different boxes
        box3.setDimens(20,20,20);
        int result2 = box5.compare(box3);
        switch (result2) {
            case -1:
                System.out.println("Our box is less");
                break;
            case 0:
                System.out.println("Boxes are equal");
                break;
            case 1:
                System.out.println("Our box is bigger");
                break;
        }
        //Learning methods that return objects
        Box box6 = box3.increase(3);
        box3.showVolume();
        box6.showVolume();
    }
}
