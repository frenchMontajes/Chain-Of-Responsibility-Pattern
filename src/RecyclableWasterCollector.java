public class RecyclableWasterCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextWasteCollector(WasteCollector nextWasteCollector) {
        this.nextCollector = nextWasteCollector;
    }

    @Override
    public void handleWaste(WasteContainer container) {
        if("Recyclable".equals(container.getWasteType()) && container.isFull()) {
            container.emptyContainer();
            System.out.println(container.getWasteType() + " Waste is collected and disposed\n");
        } else if(nextCollector != null) {
            nextCollector.handleWaste(container);
        } else {
            System.out.println("No collector available for " + container.getWasteType() + " Waste\n");
        }
    }
}
