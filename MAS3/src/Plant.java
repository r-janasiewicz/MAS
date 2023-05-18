public abstract class Plant extends Classification {

    protected String name;
    protected int age;
    private Boolean isWatered=false;

    public Plant(String name, int age) {
    }

    public void water(){
        isWatered=true;
    }

    public void takeCare(){
        water();
    }
}
