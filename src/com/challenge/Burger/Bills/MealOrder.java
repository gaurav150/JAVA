package com.challenge.Burger.Bills;

public class MealOrder {
    private final Burger burger;
    private final Item drink;
    private final Item side;

    public MealOrder() {
        this("regular", "coke", "fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {
        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new Burger(burgerType, 8.5d);
        } else {
            this.burger = new Burger(burgerType, 4.0d);
        }
        this.drink = new Item("drink", drinkType, 1.0d);
        this.side = new Item("side", sideType, 1.50d);
    }

    public double getTotalPrice() {
        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice() +
                drink.getAdjustedPrice() + burger.getAdjustedPrice();

    }

    public void printItemizedList() {
        burger.printItem();
        if (burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("_".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());

    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3,
                                  String extra4, String extra5) {
        if (burger instanceof DeluxeBurger db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
