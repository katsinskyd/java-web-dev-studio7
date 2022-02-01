package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private ArrayList<String> contents;
    private String discType;

    public BaseDisc(String name, int storageCapacity, ArrayList<String> contents, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }
}
