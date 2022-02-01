package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, int storageCapacity, ArrayList<String> contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void transferSpeed() {
        System.out.println("Data transfer speed is 11MB/sec.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
