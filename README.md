☕ Customizing Coffee Orders – Brewtiful Coffee Shop

Welcome to Brewtiful, where every cup of coffee is a masterpiece! This project demonstrates how to customize coffee orders dynamically using the Decorator Design Pattern. Customers can start with a basic coffee and add any combination of delicious toppings or flavor shots, while the system calculates the total cost and lists all ingredients.

Think of it as building your dream coffee—one decorator at a time.

🎯 Key Features

Core Component – Choose your base coffee: Black Coffee, Espresso, etc.

Dynamic Enhancements – Add Milk, Sugar, Caramel Syrup, Whipped Cream, and more.

Combinability – Stack multiple toppings in any order to create your perfect blend.

Interface Consistency – Every coffee component and decorator shares the same interface for seamless combination.

🏗 Implementation Structure
1️⃣ Component Interface

Defines the shared operations for both the base coffee and decorators.

Interface: Coffee
Methods:

getDescription() – Returns a list of all ingredients.

getCost() – Returns the total price.

2️⃣ Concrete Component

The original, undecorated coffee object.

Class: BlackCoffee
Implementation:

getDescription() → "Black Coffee"

getCost() → ₱ 100.00

3️⃣ Decorator Abstraction

Ensures all decorators implement the Coffee interface and can wrap another coffee object.

Interface: CoffeeDecorator
Implementation:

Holds a reference to a Coffee object.

Methods delegate to the wrapped coffee before adding new features.

Can wrap a base coffee or another decorator, creating a stackable, flexible system.

4️⃣ Concrete Decorators

Each decorator adds its own flavor and cost.

Class: Milk

getDescription() → wrappedCoffee.getDescription() + ", Milk"

getCost() → wrappedCoffee.getCost() + ₱ 25.00

Class: CaramelSyrup

getDescription() → wrappedCoffee.getDescription() + ", Caramel Syrup"

getCost() → wrappedCoffee.getCost() + ₱ 40.00

(Add more toppings like Sugar or Whipped Cream in the same way!)

☕ How It Works

Decorators wrap a base coffee object, adding ingredients and cost dynamically. You can stack multiple decorators to craft a fully customized cup.

Example:

Coffee blackCoffee = new BlackCoffee();
Milk milkCoffee = new Milk();
milkCoffee.setCoffee(blackCoffee);
CaramelSyrup caramelCoffee = new CaramelSyrup();
caramelCoffee.setCoffee(milkCoffee);

System.out.println(caramelCoffee.getDescription()); // Black Coffee, Milk, Caramel Syrup
System.out.println(caramelCoffee.getCost());        // ₱ 165.0

🌟 Benefits

Open/Closed Principle – Add new toppings without touching existing code.

Flexible – Any combination of toppings is possible.

Reusable – Decorators work with any coffee object.

Dynamic Behavior – Calculate descriptions and prices at runtime.
