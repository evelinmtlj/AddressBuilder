import java.util.Scanner;

public class AddressBuilder {

        public static void main(String[] args) { // strings
            // Adress builder

            Scanner scanner = new Scanner(System.in);
            StringBuilder address = new StringBuilder();
            String fullName = enterDaa("Enter full name: ");
            String billingStreet = enterDaa("Enter billing street: ");
            String billingState = enterDaa("Enter billing state: ");
            String billingZip = enterDaa("Enter zip code: ");
            String shippingStreet = enterDaa("Enter shipping street: ");
            String shipCity = enterDaa("Enter shipping state: ");
            String shipZip = enterDaa("Enter shipping zip code: ");

            String sameAdress = enterDaa("Is shipping address the same as billing adress? ");

            address.append




        } // create private to ask user information
        private static String enterDaa (String info)  {
            System.out.print(info + " ");
            return Scanner.nextLine().trim();
        }
    }




