import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Car("Nikolai", "Model S", 2017, 54999.90));
		carList.add(new Car("Fourd", "Escapade", 2017, 31999.90));
		carList.add(new Car("Chewie", "Corvette", 2017, 44989.90));

		carList.add(new UsedCar("Hyonda", "RichardPryor", 2015, 14795.50, 35987.6));
		carList.add(new UsedCar("GC", "Chirpus", 2013, 8500.00, 12345.00));
		carList.add(new UsedCar("GC", "Witherell", 2016, 14450.00, 3500.3));

		System.out.println();

		String userInput = "";


		do {

			for (Car theList : carList) {

				System.out.printf(theList.getMake() + "\t " + theList.getModel() + "\t " + theList.getYear() + "\t "
						+ "$" + theList.getPrice());
				if (theList instanceof UsedCar) {
					System.out.print("\t" + theList);
				}
				System.out.println();
			}
			System.out.println("Quit");

			System.out.println();
			System.out.println("Which car would you like? (Please type the name)");
			userInput = scnr.nextLine();

			while (!userInput.equalsIgnoreCase("y")) {

				if (userInput.equalsIgnoreCase("Nikolai")) {
					System.out.println(carList.get(0));
				} else if (userInput.equalsIgnoreCase("Fourd")) {
					System.out.println(carList.get(1));
				} else if (userInput.equalsIgnoreCase("Chewie")) {
					System.out.println(carList.get(2));
				} else if (userInput.equalsIgnoreCase("Hyonda")) {
					System.out.println(carList.get(3));
				} else if (userInput.equalsIgnoreCase("Quit")) {
					break;
				}

				if (userInput.equalsIgnoreCase("gc")) {
					System.out.println("Chripus or Witherell?");
					userInput = scnr.nextLine();
				} else if (userInput.equalsIgnoreCase("Chirpus")) {
					System.out.println(carList.get(4));
				} else {
					System.out.println(carList.get(5));
				}

				System.out.println("Would you like to buy this car?");
				userInput = scnr.nextLine();
				break;
			}

			System.out.println("Excellent our finance department will be in touch shortly!");
			carList.remove(userInput);
			continue;


		} while (!userInput.equalsIgnoreCase("qu"));
			

		System.out.println("Have a great day!!");
		scnr.close();

	}
}
