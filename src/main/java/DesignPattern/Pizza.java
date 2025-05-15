package DesignPattern;

public class Pizza {
    private final String size;         // required
    private final boolean cheese;      // optional
    private final boolean pepperoni;   // optional
    private final boolean tomatoes;    // optional

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.tomatoes = builder.tomatoes;
    }

    public static class Builder {
        private final String size; // required
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean tomatoes = false;

        public Builder(String size) {
            this.size = size;
        }

        public Builder addCheese() {
            this.cheese = true;
            return this;
        }

        public Builder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public Builder addTomatoes() {
            this.tomatoes = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size +
               ", cheese=" + cheese +
               ", pepperoni=" + pepperoni +
               ", tomatoes=" + tomatoes + "]";
    }
}

