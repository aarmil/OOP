public class Monster {
    int nEyes;
    int nHands;
    int nLegs;

    //Monster is Human
    public Monster() {
        nEyes = 2;
        nHands = 2;
        nLegs = 2;
    }

    public Monster(int nEyes) {
        this.nEyes = nEyes;
        nHands = 2;
        nLegs = 2;
    }

    public Monster(int nEyes, int nHands) {
        this.nEyes = nEyes;
        this.nHands = nHands;
        nLegs = 2;
    }

    public Monster(int nEyes, int nHands, int nLegs) {
        this.nEyes = nEyes;
        this.nHands = nHands;
        this.nLegs = nLegs;
    }

    String monsterInfo() {
        return "It has " + nEyes + " eyes, it has " + nHands + " hands, it has " + nLegs + " legs. Fear him!!!";
    }

    void showMonsterInfo() {
        System.out.println(monsterInfo());
    }

    void voice() {
        System.out.println("Voice");
    }

    void voice(int i) {
        String result = "";
        for (int j = 0; j < i; j++) {
            result += "Voice";
            if (j == i - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }

    void voice(int i, String word) {
        String result = "";
        for (int j = 0; j < i; j++) {
            result += word;
            if (j == i - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
}
