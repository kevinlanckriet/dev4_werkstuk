package be.ehb.multec.werkstukFactory;


public abstract class Car implements CarInterface {

    public abstract String getTrim();
    public abstract int getassemblyLine();

    @Override
    public Object returnObject(){
        return null;
    }
}