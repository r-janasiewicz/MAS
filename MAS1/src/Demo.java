public class Demo {

    public static void createPlant(){

        Classification c1 = new Classification("iglaste","cyprysowce","cyprysowate" , "Thujopsis dolabrata");
        Plant p1 = new Plant("sosna",12);
        Plant p2 = new Plant("zywotnikowiec japonski",53,c1);
    }

    public static void createGarden(){

        Garden g1 = new Garden();
        g1.setAdress("malborska 15");
        g1.setName("polnocny");
        g1.setSize(10,10);

        Garden g2 = new Garden();
        g2.setName("poludniowy");
        g2.setSize(12,6);
    }

}
