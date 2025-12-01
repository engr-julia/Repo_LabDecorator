public class Milk implements CoffeeDecorator {

    private Coffee coffee;

    @Override
    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 25.0;
    }
}
