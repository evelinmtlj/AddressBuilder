import java.util.Scanner;

public class AddressBuilder {


    private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) { // strings
            // Address builder



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
          shippingStreet = billingStreet;
          shippingCity = billingCity;
          shippingState = billingState;  // if shipping addres is same change shipping into billing
          shippingZip = billingZip;
           } else {
               shippingStreet = enterDaa("Enter shipping street: ");
               shippingState = enterDaa("Enter shipping state: ");
               shippingCity = enterDaa("Enter shipping city: ");
               shippingZip = enterDaa("Enter shipping zip code: "); // if not the same ask for shipping information
           }

           /* here we append we create string builder for both billing address
             and shipping address
             for apppending its
             StringBuilder nameyouwant = new StringBuilder();
            string name.append(stringgoesinside).append(\n") \n creates a new line*/

            StringBuilder addressOfBilling = new StringBuilder();
            addressOfBilling.append("Billing address: \n")  // put the name of the string builder and then append
                    .append(fullName).append("\n")
                    .append(billingStreet).append("\n")  //
                    .append(billingCity).append(", ").append(billingState).append(" ").append(billingZip); // semicolon after done with appending



            StringBuilder addressOfShipping = new StringBuilder();
            addressOfShipping.append("Shipping address: \n")
                    .append(shippingStreet).append("\n") // this will go into the next line
                    .append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip); // if you want in the same line append together
// don't forget if in the same line add spaces and commas


          // now that we added shipping address and billing address lets print them out
             System.out.println("---------- Address Info ----------");
             System.out.println(addressOfBilling);
             System.out.println();
             System.out.println(addressOfShipping);




        } // create private to ask user information
        private static String enterDaa (String info )  {
            System.out.print(info);
            return scanner.nextLine();
        }


    }




