public class TestCoffee {
    public static void main(String[] args) {
        // Base coffee
        Coffee blackCoffee = new BlackCoffee();

        // Wrap with Milk
        Milk milkCoffee = new Milk();
        milkCoffee.setCoffee(blackCoffee);

        // Wrap with Caramel Syrup
        CaramelSyrup caramelCoffee = new CaramelSyrup();
        caramelCoffee.setCoffee(milkCoffee);

        // Print final order
        System.out.println("Order: " + caramelCoffee.getDescription());
        System.out.println("Total Cost: ₱ " + caramelCoffee.getCost());
    }
}
