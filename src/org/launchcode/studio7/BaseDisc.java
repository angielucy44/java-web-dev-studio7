package org.launchcode.studio7;

public class BaseDisc {

    private int numberOfSides;

    private String name;
    private double storageCapacity;
    private String contentType;
    private String discType;

    @Override
    public String toString() {
        return "DiscInformation - \n" +
                "name: " + name + '\n' +
                 "capacity: " + storageCapacity + '\n' +
                "content: " + contentType + '\n' +
                "Disc Type: " + discType + '\n';
    }

    public BaseDisc (String name, double storageCapacity) {
        this.name = name;
        this.storageCapacity = storageCapacity;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
