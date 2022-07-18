from car import Car

if __name__ == "__main__":
    
    car = Car()
    car.license = "AMS456"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "SDE521"
    car2.driver = "Raul Guzman"
    print(vars(car2))
    