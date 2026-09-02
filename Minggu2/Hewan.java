package Minggu2;

public abstract class Hewan {
    protected String name;
    protected int age;
    protected String food;

    public Hewan(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public String getFood() { return food; }
    public void setFood(String food) { this.food = food; }

    public abstract String printSound();

    public String printData() {
        return "Nama        : " + name + "\n" +
               "Umur        : " + age + " tahun\n" +
               "Makanan     : " + food;
    }
}