public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 33,
                10, 13, 50, 28);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 64,
                45, 22, 25, 76);
        Gryffindor ron = new Gryffindor("Рон Уизли", 10,
                14, 12, 8, 9);

        Slytherin draco = new Slytherin("Драко Малфой", 23,
                68, 12, 43, 13, 75, 35);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 19,
                93, 28, 12, 42, 8, 32);
        Slytherin gregory = new Slytherin("Грегори Гойл", 84,
                65, 23, 87, 2, 1, 54);

        Hufflepuff zachariah = new Hufflepuff("Захария Смит", 23,
                54, 1, 21, 43);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 43,
                19, 76, 43, 12);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 32,
                65, 3, 7, 4);

        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 23,
                87, 23, 12, 65, 4);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 59,
                23, 12, 7, 8, 5);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 89,
                23, 2, 4, 87, 54);

        //2.

        System.out.println(ron);
        System.out.println(graham);
        System.out.println(zachariah);
        System.out.println(padma);

        //3.
        System.out.println();

        hermione.comparingStudentsGryffindor(harry);
        draco.comparingStudentsSlytherin(gregory);
        cedric.comparingStudentsHufflepuff(justin);
        zhou.comparingStudentsRavenclaw(marcus);

        //4.
        System.out.println();

        marcus.comparingStudents(draco);
        System.out.println();
        harry.comparingStudents(zhou);


    }

}
