import java.util.ArrayList;
import java.util.HashMap;

//import java.util.*;

class Main {
    public static void main(String[] args) {
        UberX uberX = new UberX("AMQ123", new Driver("Juan Herrera", "25456854"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        HashMap<String, HashMap<String, Integer>> type = new HashMap<String, HashMap<String, Integer>>();

        UberVan uberVan = new UberVan("ASD158", new Driver("Fran Castillo", "25879455"), type, new ArrayList<String>());
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
    
}