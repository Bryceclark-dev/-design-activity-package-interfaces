package com.kenzie.app;

/* Define your objects here
Interfaces:
* Customer
* Payment
*/
interface Customer {
    void createProfile(String userID);
    void updateProfile(String userID);
    void login(String userID, String password);
}

interface Payment {
    private void confirmPayment(double total) {

    }
    void printReceipt();
}
/*
Abstract Classes:
* OrderSystem
* Order
* Menu
* MenuItem

 */

abstract class OrderSystem{
    public Menu[] menuList;
    public String paymentOption;
    public Order currentOrder;
    public Customer currentCustomer;

    public abstract void selectMenu(String menu);
    public abstract void makePayment(Order order);
}
abstract class Order{
    public MenuItem[] items;
    public double total;
    public String status;

    public abstract void addItem(int itemID);
    public abstract void removeItem(int itemID);
    public abstract double getTotal();

}
abstract class Menu{
    public String name;
    public MenuItem[] items;

    public abstract void displayMenu();
    public abstract void addItem(int itemID);
    public abstract void removeItem(int itemID);

}
abstract class MenuItem{
    private int itemID;
    private String name;
    private double price;
    private String availability;

    public abstract double getPrice();
    public abstract void setPrice(double price);
    public abstract void removeItem(int itemID);

}
