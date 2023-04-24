import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plant implements Serializable {

    private static List<Plant> extent = new ArrayList<>();

    private String name;

    private Classification classification;

    private int age;

    public List<Garden> prev = new ArrayList<>();


    public Plant(String name,int age){

        this.name = name;
        this.age = age;

        extent.add(this);
    }

    public Plant(String name,int age,Classification classification){

        this.name = name;
        this.age = age;
        this.classification=classification;

        extent.add(this);
    }

    public static void writeExtent(ObjectOutputStream stream) {
        try {
            stream.writeObject(extent);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readExtent(ObjectInputStream stream) {
        try{
            extent = (ArrayList<Plant>) stream.readObject();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void show(){
        for(Plant plant : extent){
            System.out.println(plant);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public List<Garden> getPrev() {
        return prev;
    }

    public void setPrev(List<Garden> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + classification;
    }
}
