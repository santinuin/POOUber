class Main {
    public static void main(String[] args) {
        UberX uberX = new UberX("AMQ123", new Driver("Juan Herrera", "25456854"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        /*UberX uberX2 = new UberX("QES654", new Driver("Andrea Herrera", "25874965"));
        uberx2.passenger = 3;
        uberx2.printDataCar();*/
    }
    
}