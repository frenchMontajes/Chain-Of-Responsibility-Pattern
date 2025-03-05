public class WasteContainer {
    private String wasteType;
    private int wasteCapacity;
    private int wasteAmount;

    public WasteContainer(String wasteType, int wasteCapacity, int wasteAmount) {
        this.wasteType = wasteType;
        this.wasteCapacity = wasteCapacity;
        this.wasteAmount = wasteAmount;
    }

    public int getWasteCapacity() {
        return wasteCapacity;
    }

    public void setWasteCapacity(int wasteCapacity) {
        this.wasteCapacity = wasteCapacity;
    }

    public String getWasteType() {
        return wasteType;
    }

    public void setWasterType(String wasteType) {
        this.wasteType = wasteType;
    }
    public int getWasteAmount() {
        return wasteAmount;
    }

    public void setWasteAmount(int wasteAmount) {
        this.wasteAmount = wasteAmount;
    }

    public boolean isFull(){
        return wasteAmount >= wasteCapacity;
    }
    public void emptyContainer(){
        this.wasteAmount = 0;
        System.out.println( wasteType + " container has been emptied");
    }


}
