package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, int storageCapacity, ArrayList<String> contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void transferSpeed() {
        System.out.println("Data transfer speed is 1.7MB/sec.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
