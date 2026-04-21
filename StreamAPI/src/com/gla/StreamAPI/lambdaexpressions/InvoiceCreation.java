package com.gla.StreamAPI.lambdaexpressions;
import java.util.*;
import java.util.stream.*;
class Invoice {
    String id;
    Invoice(String id) {
        this.id = id;
    }
    public String toString() {
        return "Invoice ID: " + id;
    }
}
public class InvoiceCreation {
    public static void main(String[] args) {
        List<String> ids = Arrays.asList("INV1", "INV2", "INV3");
        List<Invoice> invoices = ids.stream()
                .map(Invoice::new) // constructor reference
                .collect(Collectors.toList());
        invoices.forEach(System.out::println);
    }
}