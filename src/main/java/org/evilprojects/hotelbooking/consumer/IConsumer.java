package org.evilprojects.hotelbooking.consumer;

import java.time.LocalDate;
import java.util.Optional;

public interface IConsumer {

    String getName();
    void setName(String name);
    String getPhoneNumber();
    void setPhoneNumber(String phoneNumber);
    String getConsumerInfo();
    void setConsumerInfo(String info);
    Optional<LocalDate> getBirthdayDate();
    void setBirthdayDate(int year, int month, int day);

}
