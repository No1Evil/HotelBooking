package org.evilprojects.hotelbooking.hotel;

import org.evilprojects.hotelbooking.util.math;
public abstract class AbstractRoom implements IRoom{
    private final int id;
    private final String name;
    private int bedsNumber = 1;
    private double price = 1.0;
    private boolean isBusy = false;
    protected AbstractRoom(String name, int id) {
        this.name = name;
        this.id = id;
        this.register();
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public final int getBedsNumber() {
        return bedsNumber;
    }

    @Override
    public final void setBeds(int amount) {
        this.bedsNumber = amount;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getPriceWithDiscount(int percentage) {
        return math.getDiscount(this.price, percentage);
    }

    @Override
    public final void setPrice(double price) {
        this.price = price;
    }

    @Override
    public final boolean isBusy() {
        return isBusy;
    }

    @Override
    public final void setBusy(boolean setBusy) {
        this.isBusy = setBusy;
    }
    @Override
    public final int getId() {
        return id;
    }
}
