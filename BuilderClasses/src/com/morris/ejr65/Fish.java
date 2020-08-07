package com.morris.ejr65;

/**
 * In this implementation of a fish class (disregard the fact that it's probably not the right time to implement
 * a Builder class) we've implemented a Builder class with a static factory method. This advantages of a Builder
 * class is that it keeps all parameters safe, consistent (which reduces the likeliness of errors), and immutable.
 * To instantiate a builder is also easy and neat. @see Main.java.
 *
 * @author Wali Morris
 * @since 08/06/2020
 */
public class Fish {
    final private int eyes;
    final private int fins;
    final private String color;

    public static class Builder {
        // required parameters
        private final int eyes;
        private final int fins;
        private final String color;

        public Builder(int eyes, int fins, String color) {
            this.eyes = eyes;
            this.fins = fins;
            this.color = color;
        }

        public Builder eyes(int eyes) {
            return this;
        }

        public Builder fins(int fins) {
            return this;
        }

        public Builder color(String color) {
            return this;
        }

        public Fish build() {
            return new Fish(this);
        }

    }
    private Fish(Builder builder) {
        eyes = builder.eyes;
        fins = builder.fins;
        color = builder.color;
    }

    public String getColor() {
        return this.color;
    }

    public int getEyeCount() {
        return this.eyes;
    }

    public int getFinCount() {
        return this.fins;
    }
}
