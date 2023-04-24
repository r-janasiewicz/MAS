import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Classification implements Serializable {

    private static List<Classification> extent = new ArrayList<>();

    private String classis;

    private String ordo;

    private String familia;

    private String genus;

    public Classification(String classis,String ordo,String familia,String genus){

        this.classis=classis;
        this.ordo=ordo;
        this.familia=familia;
        this.genus=genus;

        extent.add(this);
    }

    public String getClassis() {
        return classis;
    }

    public void setClassis(String classis) {
        this.classis = classis;
    }

    public void setOrdo(String ordo) {
        this.ordo = ordo;
    }

    public String getOrdo() {
        return ordo;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    @Override
    public String toString() {
        return classis + " " + ordo + " " + familia + " " + genus;
    }
}
