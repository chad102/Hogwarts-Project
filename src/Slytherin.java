public class Slytherin extends Hogwarts {
    private int trick;
    private int resolve;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgressPower, int trick, int resolve, int ambition, int resourcefulness, int lustForPower) {
        super (name, magicPower, transgressPower);
        this.trick = trick;
        this.resolve = resolve;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Факультет Слизерин {" +
                "Имя = '" + name + '\'' +
                ", Сила магии = " + magicPower +
                ", Дальность трансгрессии = " + transgressPower +
                ", Хитрость = " + trick +
                ", Решительность = " + resolve +
                ", Амбициозность = " + ambition +
                ", Находчивость = " + resourcefulness +
                ", Жажда власти = " + lustForPower +
                '}';
    }

    public void compareSlytherinStudents(Slytherin student) {
        int sum1 = this.sumPoints();
        int sum2 = student.sumPoints();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student.getName() + " (" + sum1 + " VS " + sum2 + ")");
        } else if (sum1 < sum2) {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + this.getName() + " (" + sum2 + " VS " + sum1 + ")");
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int sumPoints(){
        return this.trick + this.resolve + this.ambition + this.resourcefulness + this.lustForPower;
    }
}
