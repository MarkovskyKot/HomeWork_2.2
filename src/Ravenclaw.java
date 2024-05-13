public class Ravenclaw extends Student {
    private int intelligence;
    private int wisdom;
    private int smartness;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int smartness, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.smartness = smartness;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return getName() + ": сила магии=" + getMagicPower() +
                ", расстояние трансгресии=" + getTransgressionDistance() +
                ", интеллект=" + intelligence +
                ", мудрость=" + wisdom +
                ", остроумие=" + smartness +
                ", креативность=" + creativity;
    }
}
