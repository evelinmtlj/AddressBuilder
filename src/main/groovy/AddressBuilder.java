import java.util.Scanner;

public class AddressBuilder {

        public static void main(String[] args) {
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




        }
        private static String enterDaa (String info)  {
            Scanner scanner = new Scanner (System.in);
            System.out.print(info + " ");
            return scanner.nextLine();
        }
    }




