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
               shippingCity = enterDaa("Enter shipping city: ");
               shippingZip = enterDaa("Enter shipping zip code: ");
           }

           /* here we append we create string builder for both billing address
             and shipping address
             for apppending its
             StringBuilder nameyouwant = new StringBuilder();
            string name.append(stringgoesinside).append(\n") \n creates a new line*/

            StringBuilder billingAddress = new StringBuilder();
            billingAddress.append("Billing address: \n")
                    .append(fullName).append("\n")
                    .append(billingStreet).append("\n")
                    .append(billingCity).append(",").append(billingState).append(" ").append(billingZip);



            StringBuilder shippingAddress = new StringBuilder();
            shippingAddress.append("Shipping address: \n")
                    .append(shippingStreet).append("\n")
                    .append(shippingCity).append(",").append(shippingState).append(" ").append(shippingZip);



          // now that we added shipping address and billing address lets print them out





        } // create private to ask user information
        private static String enterDaa (String info )  {
            Scanner scanner = new Scanner(System.in);
            System.out.print(info);
            return scanner.nextLine();
        }


    }




