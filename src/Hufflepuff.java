public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int faithfulness;

    public Hufflepuff(String name, int magicPower, int transgressPower, int diligence, int loyalty, int faithfulness) {
        super(name, magicPower, transgressPower);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.faithfulness = faithfulness;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setFaithfulness(int faithfulness) {
        this.faithfulness = faithfulness;
    }

    @Override
    public String toString() {
        return "Факультет Пуффендуй {" +
                "Имя = '" + name + '\'' +
                ", Сила магии = " + magicPower +
                ", Дальность трансгрессии = " + transgressPower +
                ", Трудолюбие = " + diligence +
                ", Верность = " + loyalty +
                ", Честность = " + faithfulness +
                '}';
    }

    public void compareHufflepuffStudents(Hufflepuff student) {
        int sum1 = this.sumOfCharacterPoints();
        int sum2 = student.sumOfCharacterPoints();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + student.getName());
        } else if (sum1 < sum2) {
            System.out.println(student.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int sumOfCharacterPoints(){
        return this.diligence + this.loyalty + this.faithfulness;
    }
}
