class Main {
    public static void main(String[] args) {
        Car car = new Car("AMQ123", new Account("Juan Herrera", "25456854"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("QES654", new Account("Andrea Herrera", "25874965"));
        car2.passenger = 3;
        car2.printDataCar();
    }
    
}