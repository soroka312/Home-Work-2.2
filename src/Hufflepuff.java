public class Hufflepuff extends Hogwarts {
    private final int hardworking;
    private final int loyal;
    private final int honest;


    public Hufflepuff(String studentsName,
                      int powerOfMagic,
                      int transgressionDistance,
                      int hardworking,
                      int loyal,
                      int honest) {
        super(studentsName, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void comparingStudentsHufflepuff(Hufflepuff student) {

        if (this.sum() > student.sum()) {
            System.out.println(this.getStudentsName() + " лучший Пуффендуец, чем " + student.getStudentsName());
        } else if (this.sum() < student.sum()) {
            System.out.println(student.getStudentsName() + " лучший Пуффендуец, чем " + this.getStudentsName());
        } else {
            System.out.println("Равны");
        }
    }

    public int sum() {
        return hardworking + loyal + honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return super.toString() + " | Трудолюбие = " + hardworking +
                " | Верность = " + loyal +
                " | Честность = " + honest;
    }
}
