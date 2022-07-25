package com.kenzie.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderSystemTest {
	public static OnlineCustomer getOnlineCustomer() {
		OnlineCustomer customer = new OnlineCustomer();
		return customer;
	}

	public static CardPayment getCardPayment() {
		CardPayment payment = new CardPayment();
		return payment;
	}

	public static OnlineOrderSystem getOnlineOrderSystem() {
		OnlineOrderSystem system = new OnlineOrderSystem();
		system.paymentOption = "credit card";
		return system;
	}

	public static FoodItem getFoodItem() {
		FoodItem food = new FoodItem();
		food.name = "New food";
		return food;
	}

	public static FoodOrder getFoodOrder() {
		FoodOrder order = new FoodOrder();
		MenuItem fries = new FoodItem();
		order.items = new MenuItem[]{fries};
		return order;
	}

	public static RestaurantMenu getMenu() {
		RestaurantMenu menu = new RestaurantMenu();
		menu.name = "Food menu";
		MenuItem fries = new FoodItem();
		menu.items = new MenuItem[]{fries};
		return menu;
	}

	@Test
	void canCreateCardPayment() {
        CardPayment payment = getCardPayment();
		assertTrue(payment instanceof Payment, "CardPayment is instance of Payment" );
	}

	@Test
	void canCreateCustomer() {
		OnlineCustomer customer = getOnlineCustomer();
		assertTrue(customer instanceof Customer, "OnlineCustomer is instance of Customer" );
	}

	@Test
	void canCreateOrderSystem() {
		OnlineOrderSystem system = getOnlineOrderSystem();
		assertTrue(system instanceof OrderSystem, "OnlineOrderSystemr is instance of OrderSystem" );
		assertEquals("credit card", system.paymentOption);
	}

	@Test
	void canCreateMenu() {
		RestaurantMenu menu = getMenu();
		assertTrue(menu instanceof Menu, "RestaurantMenu is instance of Menu" );
		assertEquals("Food menu", menu.name);
		assertEquals(1, menu.items.length);
	}

	@Test
	void canCreateMenuItem() {
		FoodItem item = getFoodItem();
		assertTrue(item instanceof MenuItem, "FoodItem is instance of MenuItem" );
		assertEquals(0, item.getPrice());
		assertEquals("New food", item.name);
	}

	@Test
	void canCreateOrder() {
		FoodOrder order = getFoodOrder();
		assertTrue(order instanceof Order, "FoodOrder is instance of Order" );
		assertEquals(1, order.items.length);
	}
}
