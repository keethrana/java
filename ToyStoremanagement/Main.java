package toyproject;
import java.util.Scanner;
public class Main {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ToyDAO toyDAO = new ToyDAO();

	        while (true) {
	            System.out.println("\n--- Toy Store Management System ---");
	            System.out.println("1. Add Toy");
	            System.out.println("2. View All Toys");
	            System.out.println("3. Update Toy");
	            System.out.println("4. Delete Toy");
	            System.out.println("5. Cheapest Toy");
	            System.out.println("6. Search Toy");
	            System.out.println("7. Exit");
	            System.out.print("Choose an option: ");

	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter toy name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter price: ");
	                    double price = sc.nextDouble();

	                    toyDAO.addToy(name, price);
	                    System.out.println("Toy added.");
	                    break;

	                case 2:
	                    System.out.println("--- Toys ---");
	                    for (Toy t : toyDAO.getAllToys()) {
	                        System.out.println(t);
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter toy ID to update: ");
	                    int updateId = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter new name: ");
	                    String newName = sc.nextLine();

	                    System.out.print("Enter new price: ");
	                    double newPrice = sc.nextDouble();

	                    if (toyDAO.updateToy(updateId, newName, newPrice)) {
	                        System.out.println("Toy updated.");
	                    } else {
	                        System.out.println("Toy not found.");
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter toy ID to delete: ");
	                    int deleteId = sc.nextInt();

	                    if (toyDAO.deleteToy(deleteId)) {
	                        System.out.println("Toy deleted.");
	                    } else {
	                        System.out.println("Toy not found.");
	                    }
	                    break;

	                case 5:
	                    Toy cheapest = toyDAO.getCheapestToy();
	                    if (cheapest != null) {
	                        System.out.println("Cheapest Toy: " + cheapest);
	                    } else {
	                        System.out.println("No toys available.");
	                    }
	                    break;

	                case 6:
	                    System.out.print("Enter toy name to search: ");
	                    String searchName = sc.nextLine();

	                    Toy found = toyDAO.searchToy(searchName);
	                    if (found != null) {
	                        System.out.println("Found: " + found);
	                    } else {
	                        System.out.println("Toy not found.");
	                    }
	                    break;

	                case 7:
	                    System.out.println("Goodbye...");
	                    return;

	                default:
	                    System.out.println("Invalid option.");
	            }
	        }
	    }
	}


