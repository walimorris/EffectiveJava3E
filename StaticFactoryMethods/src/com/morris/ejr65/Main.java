package com.morris.ejr65;

public class Main {
    public static void main(String[] args) {
        Entity entity = Entity.createWithClassification();
        System.out.println(entity.getEntityClassification());
    }
}
