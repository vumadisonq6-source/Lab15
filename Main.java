import java.util.Scanner;
    //Part A
class Order {
    String drinkName;
    double basePrice;
    double discount;
    double finalPrice;
        Order(String d, double b) {  //Part A1 - Constructor
            drinkName = d;
            basePrice = b;
    }
        //Part A2 - Calculating & printing bill
    void calculatePrice() {
        Scanner sc = new Scanner(System.in);
        String memberCheck = "Y";
        System.out.print("Are you a cafe member (Y/N)? ");
        String answer = sc.next();
            //Checking for discount
        if (answer.equals(memberCheck)) {
            discount = 0.10; // 10% discount
        } else {
            discount = 0.0;
        }
        finalPrice = basePrice - (basePrice * discount);
    }

    void printBill() {
        calculatePrice();
        System.out.println("--- Bill ---");
        System.out.println("Drink: " + drinkName);
        System.out.println("Base price: $" + basePrice);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Final price: $" + finalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            //Part B1 - Displays options
        System.out.println("=== Coffee Menu ===");
        System.out.println("1. Espresso ($3.50)");
        System.out.println("2. Latte ($4.50)");
        System.out.println("3. Cappuccino ($5.00)");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt(); //Part B2 - Asking User for choice

            //Part B3 - Switch statement for drinks
        switch (choice) {
            case 1:
               new Order("Espresso", 3.50).printBill(); //Part C - prints info with choice
                break;
            case 2:
               new Order("Latte", 4.50).printBill();
                break;
            case 3:
                new Order("Cappuccino", 5.00).printBill();
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }
}
