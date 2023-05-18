public class AlivePlant extends Plant{

    private double price;

    public AlivePlant(String name, int age, double price) {
        super(name, age);
        this.price = price;
    }

    public AlivePlant(Plant prevPlant , double price) {
        super(prevPlant.name,prevPlant.age);
        this.price = price;
    }
}
