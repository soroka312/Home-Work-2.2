public abstract class Hogwarts {
    private final String studentsName;
    private final int powerOfMagic;
    private final int transgressionDistance;


    public Hogwarts(String studentsName,
                    int powerOfMagic,
                    int transgressionDistance) {
        this.studentsName = studentsName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public void comparingStudents(Hogwarts student) {
        if (this.getPowerOfMagic() > student.getPowerOfMagic()) {
            System.out.println(this.getStudentsName() + " обладает большей мощностью магии, чем " + student.getStudentsName());
        } else if (this.getPowerOfMagic() < student.getPowerOfMagic()) {
            System.out.println(student.getStudentsName() + " обладает большей мощностью магии, чем " + this.getStudentsName());
        } else {
            System.out.println("Мощности магии равны");
        }

        if (this.getTransgressionDistance() > student.getTransgressionDistance()) {
            System.out.println(this.getStudentsName() + " обладает большим расстоянием трансгрессии, чем " + student.getStudentsName());
        } else if (this.getTransgressionDistance() < student.getTransgressionDistance()) {
            System.out.println(student.getStudentsName() + " обладает большим расстоянием трансгрессии, чем " + this.getStudentsName());
        } else {
            System.out.println("Расстояния трансгрессии равны");
        }
    }


    public String getStudentsName() {
        return studentsName;
    }


    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return studentsName + " | Сила магии = " + powerOfMagic +
                " | Расстояние трансгрессии = " + transgressionDistance;
    }
}
