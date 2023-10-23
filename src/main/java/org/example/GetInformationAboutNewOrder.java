package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class GetInformationAboutNewOrder {

    private String clientName = prompt("Client name: ");
    private String product = prompt("Product: ");
    private int qnt = Integer.parseInt(prompt("Quantity: "));
    private int price = Integer.parseInt(prompt("Price: "));

    public GetInformationAboutNewOrder() {
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
