package test;

public class ManMain {
    public static void main(String[] args) {
        Man man = new Man("Ivan", 28);
        man.setAge(28);
        man.showInfo();
        System.out.println(man.getAge());
    }
}
