class Car {
    Integer id;
    String license;
    Driver driver;
    private Integer passenger;

    public Car(String license, Driver driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if(passenger != null){
        System.out.println("License: " + license + " Name Driver: " + driver.name+ " Passengers: " + passenger);
        }else {
            System.out.println("Asignar 4 pasajeros");
        }
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if (passenger == 4){
            this.passenger = passenger;
        }
    }
}
