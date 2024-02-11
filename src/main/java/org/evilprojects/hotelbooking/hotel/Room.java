package org.evilprojects.hotelbooking.hotel;

public final class Room extends AbstractRoom{

    private Room(Builder builder) {
        super(builder.name, builder.id);
        setBeds(builder.bedsNumber);
        setPrice(builder.price);
        setBusy(builder.isBusy);
    }

    public static class Builder {
        private final int id;
        private final String name;
        private int bedsNumber = 1;
        private double price = 1.0;
        private boolean isBusy = false;

        public Builder(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public Builder bedsNumber(int bedsNumber) {
            this.bedsNumber = bedsNumber;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder isBusy(boolean isBusy) {
            this.isBusy = isBusy;
            return this;
        }

        public Room build() {
            return new Room(this);
        }
    }
}
