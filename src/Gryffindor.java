public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String studentsName,
                      int powerOfMagic,
                      int transgressionDistance,
                      int nobility,
                      int honor,
                      int bravery) {
        super(studentsName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public void comparingStudentsGryffindor(Gryffindor student) {

        if (this.sum() > student.sum()) {
            System.out.println(this.getStudentsName() + " лучший Гриффиндорец, чем " + student.getStudentsName());
        } else if (this.sum() < student.sum()) {
            System.out.println(student.getStudentsName() + " лучший Гриффиндорец, чем " + this.getStudentsName());
        } else {
            System.out.println("Равны");
        }
    }

    public int sum() {
        return nobility + honor + bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


    @Override
    public String toString() {
        return super.toString() + " | Благородство = " + nobility +
                " | Честь = " + honor +
                " | Храбрость = " + bravery;
    }
}
