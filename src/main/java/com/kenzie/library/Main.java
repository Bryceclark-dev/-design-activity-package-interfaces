package com.kenzie.library;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This will only compile if the required interfaces and abstract classes are defined correctly");

    }

}

// implement Payment
class CardPayment implements Payment {

    public void confirmPayment(double payment) {
        System.out.println("Payment confirmed");
    }
    public void displayReceipt(){
        System.out.println("Receipt displayed");
    }

}

// implement Customer
class OnlineCustomer implements Customer {
    public void createProfile(String userID){
        System.out.println("Profile created");
    }

    public void updateProfile(String userID){
        System.out.println("Profile updated");
    }

    public void login(String userID,String password){
        System.out.println("Login");
    }

}

class OnlineOrderSystem extends OrderSystem {
    Menu[] menuList[];
    String paymentOption;
    Order currentOrder;
    Customer currentCustomer;

    void selectMenu(String menu) {
        System.out.println("Select Menu");
    }

    void makePayment(Order order){
        System.out.println("Make Payment");
    }
}

class FoodOrder extends Order {
    MenuItem[] items;
    double total;
    String status;

    void addItem(int itemID){
        System.out.println("add item");
    }

    void removeItem(int itemID){
        System.out.println("remove item");
    }

    double getTotal(){
        double total = 0.00;
        System.out.println("Get total");
        return total;
    }
}

class RestaurantMenu extends Menu {
    String name;
    MenuItem[] items;

    void displayMenu(){
        System.out.println("Display menu");
    }

    void addItem(int itemID){
        System.out.println("Add item");
    }

    void remoteItem(int itemID){
        System.out.println("Remove item");
    }
}

class FoodItem extends MenuItem {
    private int itemID;
    private String item;
    private double price;
    private String availability;

    double getPrice(){
        double price = 0.00;
        System.out.println("Get price");
        return price;
    }

    void setPrice(double price){
        System.out.println("Set price");
    }

    void removeItem(int itemID){
        System.out.println("Remove price");
    }
}
