public class Main {
    public static void main(String[] args) {
        Gryffindor student1 = new Gryffindor("Гарри Поттер", 67, 88, 23, 20, 30);
        Gryffindor student2 = new Gryffindor("Гермиона Грейнджер", 77, 89, 66, 39, 43);
        Gryffindor student3 = new Gryffindor("Рон Уизли", 56, 22, 91, 40, 54);
        Slytherin student4 = new Slytherin("Драко Малфой", 67, 88, 12, 26, 77,44,55);
        Slytherin student5 = new Slytherin("Грэхэм Монтегю", 77, 89, 21, 69, 82, 89,45);
        Slytherin student6 = new Slytherin("Грегори Гойл", 56, 22, 38, 96, 75, 34,57);
        Hufflepuff student7 = new Hufflepuff("Захария Смит", 70, 19, 11, 56, 37);
        Hufflepuff student8 = new Hufflepuff("Седрик Диггори", 98, 97, 44, 36, 49);
        Hufflepuff student9 = new Hufflepuff("Джастин Финч-Флетчли", 81, 49, 65, 41, 55);
        Ravenclaw student10 = new Ravenclaw("Чжоу Чанг", 23, 19, 83, 22, 53,23);
        Ravenclaw student11 = new Ravenclaw("Падма Патил", 38, 97, 78, 23, 52,65);
        Ravenclaw student12 = new Ravenclaw("Маркус Белби", 81, 49, 47, 23, 50,69);

        printStudent(student6);

        student3.compareGryffindorStudents(student2);
        student4.compareSlytherinStudents(student5);
        student8.compareHufflepuffStudents(student9);
        student10.compareRavenclawStudents(student12);

        student7.compareStudent(student11);
    }
    public static void printStudent(Hogwarts student) {
        System.out.println(student);
    }
}