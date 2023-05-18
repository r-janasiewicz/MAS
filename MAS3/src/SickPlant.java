public class SickPlant extends Plant{

    //nof = name of disease
    private String nof;

    public SickPlant(String name, int age, String nof) {
        super(name, age);
        this.nof = nof;
    }

    public SickPlant(Plant prevPlant , String nof) {
        super(prevPlant.name,prevPlant.age);
        this.nof=nof;
    }
}
