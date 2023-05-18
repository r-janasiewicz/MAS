public class DeadPlant extends Plant{

    //mod = method of disposal
    private String mod;

    public DeadPlant(String name, int age, String mod) {
        super(name, age);
        this.mod = mod;
    }

    public DeadPlant(Plant prevPlant , String mod) {
        super(prevPlant.name,prevPlant.age);
        this.mod=mod;
    }

    public void dispose() {
        System.out.println("Plant has been disposed by "+mod);
    }

    @Override
    public void takeCare() {
        dispose();
    }
}
