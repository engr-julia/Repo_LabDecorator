# Customizing Coffee Orders – Brewtiful Coffee Shop

This project demonstrates a flexible way to customize coffee orders using the **Decorator Design Pattern**. Customers at Brewtiful can select a basic coffee type and add any combination of toppings or flavor shots, with the system dynamically calculating the total cost and listing all ingredients.

## Key Requirements

- **Core Component**: A basic coffee (e.g., Espresso, Black Coffee) with a base cost.  
- **Dynamic Enhancements**: Additions such as Milk, Sugar, Caramel Syrup, or Whipped Cream can be applied on top of the base coffee.  
- **Combinability**: Multiple additions can be combined in any order (e.g., Espresso with Milk and Caramel Syrup).  
- **Interface Consistency**: Both the base coffee and all additions share a common interface, allowing seamless wrapping of components.

## Implementation Structure

### 1. Component Interface

Defines the common operations for both the base coffee and decorators.

**Interface:** `Coffee`  
**Operations:**
- `getDescription()` – Returns a description of the ingredients.  
- `getCost()` – Returns the total price.  

### 2. Concrete Component

The original, undecorated coffee object.

**Class:** `BlackCoffee`  
**Implementation:**
- `getDescription()`: returns `"Black Coffee"`  
- `getCost()`: returns `₱ 100.00`  

### 3. Decorator Abstraction

Ensures that all decorator classes implement the `Coffee` interface and hold a reference to the coffee they wrap.

**Abstract Class/Interface:** `CoffeeDecorator` (implements `Coffee`)  
**Implementation:**  
- Holds a private `Coffee` object.  
- Constructor or setter to wrap the base coffee or another decorator.  
- Methods typically call the wrapped object's methods before adding their own enhancements.

### 4. Concrete Decorators

These classes add specific features (ingredients and cost) to the wrapped coffee object.

**Class:** `Milk`  
- `getDescription()`: returns `wrappedCoffee.getDescription() + ", Milk"`  
- `getCost()`: returns `wrappedCoffee.getCost() + ₱ 25.00`  

**Class:** `CaramelSyrup`  
- `getDescription()`: returns `wrappedCoffee.getDescription() + ", Caramel Syrup"`  
- `getCost()`: returns `wrappedCoffee.getCost() + ₱ 40.00`  

## How It Works

Decorators wrap a base coffee object, adding new ingredients and cost dynamically. Multiple decorators can be stacked to produce a fully customized coffee order. For example:

- A `BlackCoffee` wrapped with `Milk` and `CaramelSyrup` will produce:  
  **Description:** `"Black Coffee, Milk, Caramel Syrup"`  
  **Cost:** `₱ 165.00`

## Benefits

- **Open/Closed Principle**: Easily add new coffee toppings without changing existing code.  
- **Flexible**: Any combination of additions is possible.  
- **Reusable**: Decorators can be applied to any coffee object.  
- **Dynamic Behavior**: Calculate descriptions and prices at runtime.

