package practiceProblem_08_b;
import java.util.Scanner;
class restaurant{
    double tax = 0.10;
    double calculateTotalBill(double foodPrice) {
        return foodPrice + (foodPrice * tax);
    }
    int estimateDeliveryTime() {
        return 40;
    }
}
class FastFoodRestaurant extends restaurant {

    FastFoodRestaurant() {
        this.tax = 0.15;
    }
    int estimateDeliveryTime() {
        return 20;
    }
}
class FineDiningRestaurant extends restaurant {
    int estimateDeliveryTime() {
        return 60;
    }
}


public class problem_08_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select restaurant type: ");
        System.out.println("1. Normal Restaurant");
        System.out.println("2. Fast Food Restaurant");
        System.out.println("3. Fine Dining Restaurant");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();

        System.out.print("Enter the food price: $");
        double foodPrice = sc.nextDouble();

        restaurant restaurant;

        switch (choice) {
            case 1:
                restaurant = new restaurant();
                break;
            case 2:
                restaurant = new FastFoodRestaurant();
                break;
            case 3:
                restaurant = new FineDiningRestaurant();
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Normal Restaurant.");
                restaurant = new restaurant();
        }
        System.out.println("\n=== Order Summary ===");
        System.out.println("Total Bill: $" + restaurant.calculateTotalBill(foodPrice));
        System.out.println("Estimated Delivery Time: " + restaurant.estimateDeliveryTime() + " mins");

        sc.close();

    }


}
