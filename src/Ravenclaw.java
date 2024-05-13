public class Ravenclaw extends Hogwarts {
    private final int smart;
    private final int wise;
    private final int witty;
    private final int creativity;

    public Ravenclaw(String studentsName,
                     int powerOfMagic,
                     int transgressionDistance,
                     int smart,
                     int wise,
                     int witty,
                     int creativity) {
        super(studentsName, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public void comparingStudentsRavenclaw(Ravenclaw student) {

        if (this.sum() > student.sum()) {
            System.out.println(this.getStudentsName() + " лучший Когтевранец, чем " + student.getStudentsName());
        } else if (this.sum() < student.sum()) {
            System.out.println(student.getStudentsName() + " лучший Когтевранец, чем " + this.getStudentsName());
        } else {
            System.out.println("Равны");
        }
    }

    public int sum() {
        return smart + wise + witty + creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() + " | Умность = " + smart +
                " | Мудрость = " + wise +
                " | Остроумие = " + witty +
                " | Творчество = " + creativity;
    }
}
