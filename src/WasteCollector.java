public interface WasteCollector {
    void setNextWasteCollector(WasteCollector nextWasteCollector);
    void handleWaste(WasteContainer container);
}
