import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String userCarMake = "";
		String userCarModel = "";
		int userCarYear = 0;
		double userCarPrice = 0.0;
		
		// String userInputAnswer = "";
		
		System.out.println("Welcome to the Grand Circus Motors Admin Console!");
		System.out.println();

		/// This gets the cars you want to enter
		System.out.println("How many cars do you want to enter?");
		int userInput = scnr.nextInt();
		scnr.nextLine();

		System.out.println();

		// carList array to add too
		ArrayList<Car> carList = new ArrayList<>();


			for (int i = 0; i < userInput; i++) {
			System.out.println();
			
			System.out.println("Enter Car # " + (i + 1) + " Make: ");
			userCarMake = scnr.nextLine();

			System.out.println("Enter Car # " + (i + 1) + " Model: ");
			userCarModel = scnr.nextLine();

			System.out.println("Enter Car # " + (i + 1) + " Year: ");
			userCarYear = scnr.nextInt();

			System.out.println("Enter Car # " + (i + 1) + " Price: ");
			userCarPrice = scnr.nextDouble();

			Car cr1 = new Car();
			cr1.make = userCarMake;
			cr1.model = userCarModel;
			cr1.year = userCarYear;
			cr1.price = userCarPrice;

			// Add car to the list
			carList.add(cr1);

			System.out.println();
			scnr.nextLine();
			
			//System.out.println(cr1.getMake() + " " + cr1.getModel() + " " + cr1.getYear() + " " + cr1.getPrice());
			
		}

			System.out.println("Current Inventory: ");

		// print f decimal?
			for (Car totalCars : carList) {
				System.out.printf(totalCars.getMake() + "\t " + totalCars.getModel() + " \t " + totalCars.getYear()
						+ " \t " + "$" + totalCars.getPrice());
			System.out.println();

		}
		scnr.close();

	}
}


