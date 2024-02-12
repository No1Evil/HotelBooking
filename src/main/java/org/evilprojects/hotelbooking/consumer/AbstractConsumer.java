package org.evilprojects.hotelbooking.consumer;

import java.time.LocalDate;
import java.util.Optional;

public abstract class AbstractConsumer implements IConsumer{

    private String name;
    private Optional<LocalDate> birthdayDate = Optional.empty();
    private String phoneNumber;
    private String consumerInfo;

    public AbstractConsumer(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getConsumerInfo() {
        return this.consumerInfo;
    }

    @Override
    public void setConsumerInfo(String info) {
        this.consumerInfo = info;
    }

    @Override
    public Optional<LocalDate> getBirthdayDate() {
        return birthdayDate;
    }
    @Override
    public void setBirthdayDate(int year, int month, int day){
        LocalDate date = LocalDate.of(year, month, day);
        this.birthdayDate = Optional.of(date);
    }
}
