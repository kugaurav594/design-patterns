package com.braindevoiler.designpattern.creational.simpleFactory;

public class SimpleFactoryTest {

    public static void main(String args[]){
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE);
    }
}
