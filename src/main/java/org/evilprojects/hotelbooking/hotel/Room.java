package org.evilprojects.hotelbooking.hotel;

import org.evilprojects.hotelbooking.consumer.IConsumer;
public final class Room extends AbstractRoom{

    private Room(Builder builder) {
        super(builder.name, builder.id);
        setBeds(builder.bedsNumber);
        setPrice(builder.price);
        setConsumer(builder.consumer);
    }

    public static class Builder {
        private final int id;
        private final String name;
        private int bedsNumber = 1;
        private double price = 1.0;
        private IConsumer consumer;
        public Builder(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public Builder setBedsNumber(int bedsNumber) {
            this.bedsNumber = bedsNumber;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setConsumer(IConsumer consumer){
            this.consumer = consumer;
            return this;
        }

        public Room build() {
            return new Room(this);
        }
    }
}
