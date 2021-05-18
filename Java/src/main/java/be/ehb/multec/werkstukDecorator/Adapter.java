package be.ehb.multec.werkstukDecorator;

import be.ehb.multec.werkstukFactory.Car;

public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void targetRequest(Car car) {
        adaptee.converter(car); //translate request - delegation
    }

}
