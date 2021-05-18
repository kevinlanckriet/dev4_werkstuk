package be.ehb.multec.werkstukDecorator;

public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void targetRequest(Model model) {
        adaptee.converter(model); //translate request - delegation
    }

}
