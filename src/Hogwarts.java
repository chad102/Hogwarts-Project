public class Hogwarts {
    protected String name;
    protected int magicPower;
    protected int transgressPower;

    public Hogwarts(String name, int magicPower, int transgressPower) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressPower = transgressPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressPower() {
        return transgressPower;
    }

    public void setTransgressPower(int transgressPower) {
        this.transgressPower = transgressPower;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressPower=" + transgressPower +
                '}';
    }

    public int sumPoints () {
        return getMagicPower() + getTransgressPower();
    }

    public void compareStudent (Hogwarts student) {
        int sumPoints1 = this.sumPoints();
        int sumPoints2 = student.sumPoints();
        if (sumPoints1 > sumPoints2) {
            System.out.println(this.getName() + " обладает бОльшей мощностью магии, чем " + student.getName());
        } else if (sumPoints1 < sumPoints2) {
            System.out.println(student.getName() + " обладает бОльшей мощностью магии, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны по силе магии");
        }
    }
}
