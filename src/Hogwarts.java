public class Hogwarts {
    public void printStudent(Student student) {
        System.out.println(student);
    }

    public void compareAnyStudents(Student first, Student second) {
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println(first.getName() + " обладает большей магической силой, чем " + second.getName());
        } else if (first.getMagicPower() < second.getMagicPower()) {
            System.out.println(second.getName() + " обладает большей магической силой, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " и " + second.getName() + " равны по силе");
        }
        if (first.getTransgressionDistance() > second.getTransgressionDistance()) {
            System.out.println(first.getName() + " трансгрессирует дальше, чем " + second.getName());
        } else if (first.getTransgressionDistance() < second.getTransgressionDistance()) {
            System.out.println(second.getName() + " трансгрессирует дальше, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " трансгрессирует на такое же расстояние, как и" + second.getName());
        }
    }

    public void compareGriffindorStudent(Griffindor first, Griffindor second) {
        int firstSum = first.getNobility() + first.getHonor() + first.getBravery();
        int secondSum = second.getNobility() + second.getHonor() + second.getBravery();
        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучший ученик Гриффиндора, чем " + second.getName());
        } else if (firstSum < secondSum) {
            System.out.println(second.getName() + " лучший ученик Гриффиндора, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " и " + second.getName() + " в целом одинаково хороши");
        }
    }

    public void compareHufflepuffStudent(Hufflepuff first, Hufflepuff second) {
        int firstSum = first.getIntegrity() + first.getLoyalty() + first.getHardWork();
        int secondSum = second.getIntegrity() + second.getLoyalty() + second.getHardWork();
        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучший ученик Пуффендуя, чем " + second.getName());
        } else if (firstSum < secondSum) {
            System.out.println(second.getName() + " лучший ученик Пуффендуя, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " и " + second.getName() + " в целом одинаково хороши");
        }
    }

    public void compareRavenclawStudent(Ravenclaw first, Ravenclaw second) {
        int firstSum = first.getIntelligence() + first.getWisdom() + first.getSmartness() + first.getCreativity();
        int secondSum = second.getIntelligence() + second.getWisdom() + second.getSmartness() + second.getCreativity();
        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучший ученик Когтеврана, чем " + second.getName());
        } else if (firstSum < secondSum) {
            System.out.println(second.getName() + " лучший ученик Когтеврана, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " и " + second.getName() + " в целом одинаково хороши");
        }
    }

    public void compareSlytherinStudent(Slytherin first, Slytherin second) {
        int firstSum = first.getCunning() + first.getAmbition() + first.getPowerLust() + first.getDecisiveness() + first.getResourcefulness();
        int secondSum = second.getCunning() + second.getAmbition() + second.getPowerLust() + second.getDecisiveness() + second.getResourcefulness();
        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучший ученик Слизерина, чем " + second.getName());
        } else if (firstSum < secondSum) {
            System.out.println(second.getName() + " лучший ученик Слизерина, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " и " + second.getName() + " в целом одинаково хороши");
        }
    }

}
