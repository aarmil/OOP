public class HomeworkMain {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Human human4 = new Human();
        Human human5 = new Human();

        human1.name = "Max";
        human1.age = 18;
        human1.weight = 60;
        human2.name = "George";
        human2.age = 30;
        human2.weight = 75.2;
        human3.name = "Maria";
        human3.age = 24;
        human3.weight = 45;
        human4.name = "Michael";
        human4.age = 44;
        human4.weight = 100;
        human5.name = "Liza";
        human5.age = 34;
        human5.weight = 50.5;

        Human[] humans = new Human[5];
        humans[0] = human1;
        humans[1] = human2;
        humans[2] = human3;
        humans[3] = human4;
        humans[4] = human5;

        int sum = 0;
        for (int i = 0; i < humans.length; i++) {
            sum += humans[i].age;
        }
        int averAge = sum / humans.length;
        System.out.println("Average age of humans = " + averAge);
    }
}
