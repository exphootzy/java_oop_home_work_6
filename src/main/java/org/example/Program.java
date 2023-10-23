package org.example;

public class Program {
    public static void main(String[] args) {

        System.out.println("Input your order: ");

        GetInformationAboutNewOrder infoOrder = new GetInformationAboutNewOrder();

        Order order = new Order(infoOrder.getClientName(), infoOrder.getProduct(), infoOrder.getQnt(), infoOrder.getPrice());

        SaveToJson saveToJson = new SaveToJson(order);

        saveToJson.saveToJson();

    }

}
