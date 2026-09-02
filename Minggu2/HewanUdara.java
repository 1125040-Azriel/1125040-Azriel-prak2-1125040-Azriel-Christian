package Minggu2;

public abstract class HewanUdara extends Hewan {
    protected double wingSpan;

    public HewanUdara(String name, int age, String food, double wingSpan) {
        super(name, age, food);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() { return wingSpan; }
    public void setWingSpan(double wingSpan) { this.wingSpan = wingSpan; }

    @Override
    public String printData() {
        return super.printData() + "\nRentang Sayap: " + wingSpan + " meter";
    }
}