public class Main {
    public static void main(String[] args) {
        Hogwarts hogwartsMethod = new Hogwarts();
        Griffindor garry = new Griffindor("Гарри Поттер", 29, 31, 79, 67, 81);
        Griffindor hermione = new Griffindor("Гермиона Грейнджер", 27, 36, 81, 72, 78);
        Griffindor ron = new Griffindor("Рон Уизли", 22, 27, 69, 74, 53);
        Hufflepuff zechariah = new Hufflepuff("Захария Смит", 23, 39, 72, 67, 81);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 26, 41, 82, 87, 94);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 18, 23, 74, 65, 48);
        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 16, 19, 66, 75, 62, 71);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 17, 21, 79, 92, 82, 58);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 21, 24, 80, 63, 87, 93);
        Slytherin draco = new Slytherin("Драко Малфой", 24, 29, 65, 74, 77, 63, 59);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 16, 12, 37, 34, 26, 52, 43);
        Slytherin gregory = new Slytherin("Грегори Гойл", 15, 11, 35, 23, 29, 39, 41);
        hogwartsMethod.printStudent(garry);
        hogwartsMethod.compareAnyStudents(hermione, garry);
        hogwartsMethod.compareGriffindorStudent(garry, hermione);
        hogwartsMethod.compareHufflepuffStudent(zechariah, justin);
    }
}