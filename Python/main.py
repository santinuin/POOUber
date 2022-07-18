from lib2to3.pgen2 import driver
from car import Car
from account import Account

if __name__ == "__main__":
    
    car = Car("SDA154", Account("Andres Herrera", "21351456"))
    print(vars(car))
    print(vars(car.driver))