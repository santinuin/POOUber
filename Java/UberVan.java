import java.util.*;

class UberVan extends Car{

    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial; 

    public UberVan(String license, Account driver,
    Map<String, Map<String, Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){

        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }

    
}
