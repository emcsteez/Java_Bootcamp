public class CafeJava {

    public static void main(String[] args) {

        // APP VARIABLES

        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0;
        double lattePrice = 4.5;
        double cappucinoPrice = 2.5;

        // Customer name variables (add yours below)
        String customer1 = "Emily";
        String customer2 = "Elijah";
        String customer3 = "Arlon";
        String customer4 = "Caleb";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;


        // App interaction simulation (Add your code for the challenges below)
        
        // Ex
        System.out.println(generalGreeting + customer1);
        
        // 1.
        System.out.println(customer1 + pendingMessage);

        // 2.
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappucinoPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }
        
        // 3.
        System.out.println(displayTotalMessage + lattePrice * 2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }


        // 4.
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));

    }

}