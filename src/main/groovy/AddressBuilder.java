import java.util.Scanner;

public class AddressBuilder {

        public static void main(String[] args) { // strings
            // Adress builder

           Scanner scanner = new Scanner(System.in);
            StringBuilder address = new StringBuilder();
            String fullName = enterDaa("Enter full name: ");
            String billingStreet = enterDaa("Enter billing street: ");
            String billingState = enterDaa("Enter billing state: ");
            String billingCity = enterDaa("Enter billing city: ");
            String billingZip = enterDaa("Enter zip code: ");
            // ask if shipping address is also the same
// create a boolean statement for same address
            System.out.println("Is shipping address the same as billing address? Y or N: ");
            String answer = scanner.nextLine().trim().toLowerCase();
            boolean response = answer.equals("y");


            String shippingStreet = " ";
           String  shippingCity = " ";
           String  shippingState = " ";
           String  shippingZip = " ";

// ELSE IS IF BOTH ADDRESSES ARE NOT THE SAME
           if (response) {
    billingStreet = shippingStreet;
    billingState = shippingState;
    billingCity = shippingCity;
    billingZip = shippingZip;
           } else {
               shippingStreet = enterDaa("Enter shipping street: ");
               shippingState = enterDaa("Enter shipping state: ");
               shippingCity = enterDaa("Enter shipping city:");
               shippingZip = enterDaa("Enter shipping zip code: ");
           }






        } // create private to ask user information
        private static String enterDaa (String info )  {
            Scanner scanner = new Scanner(System.in);
            System.out.print(info);
            return scanner.nextLine();
        }


    }




