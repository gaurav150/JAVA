package com.challenge.Burger.Bills;

public class ChallengeBillsBurgerMain {
    public static void main(String[] args) {
//        Item coke = new Item("drink","coke",1.50d);
//        coke.printItem();
//        String size = "Large".toUpperCase();
//        coke.setSize(size);
//        coke.printItem();
//
//        Item avocado = new Item("Topping","avocado",1.67d);
//        avocado.printItem();
//        Burger burger = new Burger("regular",4.00d);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();
//
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey","7-up","chili");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder thirdMeal = new MealOrder("deluxe", "7-up", "chili");
        thirdMeal.addBurgerToppings("AVOCADO", "CHEESE", "MAYO",
                "BACON", "LETTUCE");
        thirdMeal.setDrinkSize("SMALL");
        thirdMeal.printItemizedList();
    }
}
