class Car {
    private Integer id;
    private String license;
    private Driver driver;
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
            this.passenger = passenger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    
}
