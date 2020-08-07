package com.morris.ejr65;

/**
 * Entity implements a static factory method rather than a typical constructor
 */

public class Entity {

    public static Entity createWithClassification() {
        return new Entity();
    }

    public String getEntityClassification() {
        return "UNKNOWN";
    }

}
