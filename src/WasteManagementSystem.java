public class WasteManagementSystem {
    private final WasteCollector nextCollector;

    public WasteManagementSystem() {
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasterCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        this.nextCollector = organicCollector;
        organicCollector.setNextWasteCollector(recyclableCollector);
        recyclableCollector.setNextWasteCollector(hazardousCollector);
    }

    public void collectWaste(WasteContainer container) {
        if (container.isFull()){
            System.out.println( container.getWasteType() + " container is Full");
            System.out.println("Collecting waste for " + container.getWasteType() + " waste");
            nextCollector.handleWaste(container);
        } else {
            System.out.println("Waste container is not full yet.\n");
        }
    }
}
