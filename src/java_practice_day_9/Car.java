package java_practice_day_9;

import java.util.Arrays;

public class Car {
    int price$ = 3000;
    String make;  //null
    String model; //null
    public Car(){
    }
    public Car(int price$, String make, String model){
        this.price$ = price$;
        this.make = make;
        this.model = model;
    }
    public static void main(String[] args) {
        Car car2 = new Car(5000, "Audi", "Q5");
        Car car3 = new Car(4000, "GMC", "Yukon");
        System.out.println(car2.make);
        System.out.println(car3.make);
    }
}
