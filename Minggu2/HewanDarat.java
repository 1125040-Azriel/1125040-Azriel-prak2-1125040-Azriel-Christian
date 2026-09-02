package Minggu2;

public abstract class HewanDarat extends Hewan {
    protected int numberOfLegs;

    public HewanDarat(String name, int age, String food, int numberOfLegs) {
        super(name, age, food);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() { return numberOfLegs; }
    public void setNumberOfLegs(int numberOfLegs) { this.numberOfLegs = numberOfLegs; }

    public void move() {
        System.out.println(name + " berjalan/berlari di daratan.");
    }

    @Override
    public String printData() {
        return super.printData() + "\nJumlah Kaki : " + numberOfLegs;
    }
}