import java.util.*;

class UberBlack extends Car{
    
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial; 

    public UberBlack(String license, Driver driver,
    Map<String, Map<String, Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){

        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }


}