import java.io.*;
import java.util.Scanner;


public class Main {

    public static String extentFile = "extent.txt";
    public static String extentFileSerialization = "serial.txt";
    private static boolean breakFlag = false;

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        while(!breakFlag) {

            System.out.println("1-Stworz rosliny");
            System.out.println("2-Stworz ogrod");
            System.out.println("3-Wyswietl rosliny");
            System.out.println("4-Wyswietl ogrod");
            System.out.println("5-Prosty zapis");
            System.out.println("6-Serializacja");
            System.out.println("7-Prosty odczyt");
            System.out.println("8-Deserializacja");
            System.out.println("9-Zakoncz");

            int option = in.nextInt();

            switch (option) {
                case 1:
                    Demo.createPlant();
                    break;
                case 2:
                    Demo.createGarden();
                    break;
                case 3:
                    Garden.show();
                    break;
                case 4:
                    Plant.show();
                    break;
                case 5:
                    saveSimple();
                    break;
                case 6:
                    serializeObjects();
                    break;
                case 7:
                    loadSimple();
                    break;
                case 8:
                    deserializeObjects();
                    break;
                case 9:
                    breakFlag=true;
                    break;
            }
        }
    }

    private static void saveSimple() {
        try {
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(extentFile)));
            Garden.writeExtent(dos);
            dos.close();
            System.out.println("Data saved...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadSimple() {
        System.out.println("Loading data...");
        try {
            DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(extentFile)));
            Garden.readExtent(dos);
            dos.close();
            System.out.println("Data loaded...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void serializeObjects() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(extentFileSerialization));
            Plant.writeExtent(out);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializeObjects() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(extentFileSerialization));
            Plant.readExtent(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
