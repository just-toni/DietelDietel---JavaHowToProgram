package com.Exercises.chapterThree.InvoiceClass;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("", "",0 ,0);

        invoice.setNumber("96280");
        invoice.setDescription("This is the car engine number");
        invoice.setItemQuantity(2);
        invoice.setPrice(-2);

        System.out.println("Part number is: " + invoice.getNumber() + "\nDescription of part is: " +
                invoice.getDescription() + "\nItem Quantity to be purchased is: " + invoice.getItemQuantity() +
                "\nPrice of per item is: " + invoice.getPrice() + "\nTotal price is: " + invoice.getInvoiceAmount());
    }
}

