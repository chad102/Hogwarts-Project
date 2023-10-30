public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creative;

    public Ravenclaw(String name, int magicPower, int transgressPower, int intelligence, int wisdom, int wit, int creative) {
        super(name, magicPower, transgressPower);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Факультет Когтевран {" +
                "Имя = '" + name + '\'' +
                ", Сила магии = " + magicPower +
                ", Дальность трансгрессии = " + transgressPower +
                ", Интеллект = " + intelligence +
                ", Мудрость = " + wisdom +
                ", Остроумие =" + wit +
                ", Уровень творчества =" + creative +
                '}';
    }

    public void compareRavenclawStudents(Ravenclaw student) {
        int sum1 = this.sumOfCharacterPoints();
        int sum2 = student.sumOfCharacterPoints();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + student.getName());
        } else if (sum1 < sum2) {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int sumOfCharacterPoints(){
        return this.intelligence + this.wisdom + this.wit + this.creative;
    }
}
