public class MonsterMain {
    public static void main(String[] args) {

        Monster monster = new Monster(5, 10, 3);
        monster.showMonsterInfo();

        monster.voice(2, "Arghr");
    }
}
