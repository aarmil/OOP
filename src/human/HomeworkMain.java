package human;

public class HomeworkMain {
    public static void main(String[] args) {
        Human human1 = new Human("Max", 18, 60);
        Human human2 = new Human("George", 30,75.2);
        Human human3 = new Human("Maria", 24, 45);
        Human human4 = new Human("Michael",44,100);
        Human human5 = new Human("Liza", 34, 50.5);


        Human[] humans = new Human[5];
        humans[0] = human1;
        humans[1] = human2;
        humans[2] = human3;
        humans[3] = human4;
        humans[4] = human5;

        int sum = 0;
        for (int i = 0; i < humans.length; i++) {
            sum += humans[i].getAge();
        }
        int averAge = sum / humans.length;
        System.out.println("Average age of humans = " + averAge);
    }
}
