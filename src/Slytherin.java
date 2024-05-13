public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(String studentsName,
                     int powerOfMagic,
                     int transgressionDistance,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int thirstForPower) {
        super(studentsName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void comparingStudentsSlytherin(Slytherin student) {

        if (this.sum() > student.sum()) {
            System.out.println(this.getStudentsName() + " лучший Слизеринец, чем " + student.getStudentsName());
        } else if (this.sum() < student.sum()) {
            System.out.println(student.getStudentsName() + " лучший Слизеринец, чем " + this.getStudentsName());
        } else {
            System.out.println("Равны");
        }
    }

    public int sum() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() + " | Хитрость = " + cunning +
                " | Решительность = " + determination +
                " | Амбициозность = " + ambition +
                " | Находчивость = " + resourcefulness +
                " | Жажда власти = " + thirstForPower;
    }
}
