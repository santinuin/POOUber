import java.util.*;

class UberVan extends Car{

    HashMap<String, HashMap<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial; 

    public UberVan(String license, Driver driver,
    HashMap<String, HashMap<String, Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){

        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6){
            super.setPassenger(passenger);
        }else{
            
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }

    void printDataCar() {
        if (getPassenger() == 6){
        System.out.println("License: " + getLicense() + " Name Driver: " + getDriver().name + " Passengers: " + getPassenger());
    }else{
        System.out.println("Necesitas asignar 6 pasajeros");
    }
        }
    

    
}
