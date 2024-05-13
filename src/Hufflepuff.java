public class Hufflepuff extends Student {
    private int integrity;
    private int loyalty;
    private int hardWork;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int integrity, int loyalty, int hardWork) {
        super(name, magicPower, transgressionDistance);
        this.integrity = integrity;
        this.loyalty = loyalty;
        this.hardWork = hardWork;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    @Override
    public String toString() {
        return getName() + ": сила магии=" + getMagicPower() +
                ", расстояние трансгресии=" + getTransgressionDistance() +
                ", честность=" + integrity +
                ", верность=" + loyalty +
                ", трудолюбие=" + hardWork;
    }
}
