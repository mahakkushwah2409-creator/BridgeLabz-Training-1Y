package com.gla.generics;
import java.util.*;
abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }

    public String toString() {
        return name;
    }
}

class Elect extends WarehouseItem {
    Elect(String name) { super(name); }
}

class Groceries extends WarehouseItem {
    Groceries(String name) { super(name); }
}

class Furniture extends WarehouseItem {
    Furniture(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class WarehouseUtil {
    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item);
        }
    }
}

class Management {
    public static void main(String[] args) {
        Storage<Elect> eStore = new Storage<>();
        eStore.addItem(new Elect("TV"));
        WarehouseUtil.displayAll(eStore.getItems());
    }
}