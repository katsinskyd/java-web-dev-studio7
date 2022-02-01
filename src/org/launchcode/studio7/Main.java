package org.launchcode.studio7;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        CD myCD = new CD("title", 700, new ArrayList<>(Arrays.asList( "song", "song 2")), "CD");
        DVD myDVD = new DVD("DVD title", 18, new ArrayList<>(Arrays.asList( "gluten")), "DVD");

        myCD.spinDisc();
        myDVD.spinDisc();

        myCD.transferSpeed();
        myDVD.transferSpeed();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
