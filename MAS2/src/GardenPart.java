public class GardenPart {
    public String name; // public for simplicity
    private Garden garden;
    private GardenPart(Garden garden, String name) {
        this.name = name;
        this.garden = garden;
    }
    public static GardenPart createPart(Garden garden, String name) throws Exception {
        if(garden == null) {
            throw new Exception("The given whole does not exist!");
        }
// Create a new part
        GardenPart part = new GardenPart(garden, name);
// Add to the whole
        garden.addPart(part);
        return part;
    }
}
