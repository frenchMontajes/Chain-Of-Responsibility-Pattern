public class WasteManagementApp {
    public static void main(String[] args) {
        WasteManagementSystem system = new WasteManagementSystem();

        WasteContainer organicCollector = new WasteContainer("Organic",100,100);
        WasteContainer recyclableCollector = new WasteContainer("Recyclable",100,80);
        WasteContainer hazardousCollector = new WasteContainer("Agricultural",100,100);

        system.collectWaste(organicCollector);
        system.collectWaste(recyclableCollector);
        system.collectWaste(hazardousCollector);

        hazardousCollector = new WasteContainer("Hazardous",100,120);
        recyclableCollector = new WasteContainer("Recyclable",100,100);
        system.collectWaste(hazardousCollector);
        system.collectWaste(recyclableCollector);
    }
}
