import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Garden implements Serializable {

    private static List<Garden> extent = new ArrayList<>();

    public String name;

    public double sizex;
    public double sizey;
    public double size;

    public static String adress;

    public Garden(){
        extent.add(this);
    }

    public static void show(){
        for(Garden garden : extent){
            System.out.println(garden);
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public double getSize(){
        return size;
    }
    public void setSize(double sizex,double sizey){
        this.sizex=sizex;
        this.sizey=sizey;
        this.size=sizex*sizey;
    }
    public void setSize(double size){
        this.size=size;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    private void write(DataOutputStream stream) {
        try {
            stream.writeUTF(name);
            stream.writeDouble(size);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void read(DataInputStream stream) {
        try {
            name = stream.readUTF();
            size = stream.readDouble();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeExtent(DataOutputStream stream) throws IOException {
        stream.writeInt(extent.size());
        for(Garden garden : extent) {
            garden.write(stream);
        }
    }

    public static void readExtent(DataInputStream stream) throws IOException {
        Garden garden = null;
        int objCount = stream.readInt();
        extent.clear();
        for(int i =0;i < objCount; i++) {
            garden = new Garden();
            garden.read(stream);
        }
    }

    @Override
    public String toString() {
        return name + " " + size + " " + adress;
    }
}
