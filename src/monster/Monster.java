package monster;

public class Monster {
    private int nEyes;
    private int nHands;
    private int nLegs;

    //Monster is human
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

    public String monsterInfo() {
        return "It has " + nEyes + " eyes, it has " + nHands + " hands, it has " + nLegs + " legs. Fear him!!!";
    }

    public void showMonsterInfo() {
        System.out.println(monsterInfo());
    }

    public void voice() {
        System.out.println("Voice");
    }

    public void voice(int i) {
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

    public void voice(int i, String word) {
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

    public int getnEyes() {
        return nEyes;
    }

    public int getnHands() {
        return nHands;
    }

    public int getnLegs() {
        return nLegs;
    }
}
