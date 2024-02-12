package org.evilprojects.hotelbooking.consumer;

import java.time.LocalDate;
import java.util.Optional;

public final class Consumer extends AbstractConsumer{
    public Consumer(Builder builder) {
        super(builder.name, builder.phoneNumber);
        this.setConsumerInfo(builder.consumerInfo);

        if (builder.birthdayDate.isPresent()){
            LocalDate date = builder.birthdayDate.get();
            this.setBirthdayDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
        }
    }

    public static class Builder {
        private final String name;
        private Optional<LocalDate> birthdayDate;
        private final String phoneNumber;
        private String consumerInfo;

        public Builder(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public Consumer.Builder setBirthdayDate(int year, int month, int day) {
            LocalDate date = LocalDate.of(year, month, day);
            this.birthdayDate = Optional.of(date);
            return this;
        }

        public Consumer.Builder setConsumerInfo(String info){
            this.consumerInfo = info;
            return this;
        }

        public Consumer build() {
            return new Consumer(this);
        }
    }
}
