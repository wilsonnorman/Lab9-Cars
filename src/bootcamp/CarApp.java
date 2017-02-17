package bootcamp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by wilsonnorman on 2/16/2017.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grand Circus Motors admin console!");
        System.out.println("How many cars are you entering");

        int numCars = scan.nextInt();
        System.out.println();

        ArrayList<Car> carList = new ArrayList<Car>();

        for(int i =0; i < numCars; i++) {


            System.out.println("What make?");
            String makeCar = scan.next();

            System.out.println("What model?");
            String modCar = scan.next();

            System.out.println("What year?");
            int carYear = scan.nextInt();

            System.out.println("What price range?");
            double carPrice = scan.nextDouble();


            Car cl = new Car(makeCar, modCar, carYear, carPrice);
            carList.add(cl);
        }
          for (Car c: carList){
              System.out.println(c);
          }
           System.out.println("Thanks for you for taken care of you car needs, here at Grand Circus!");
    }

}
