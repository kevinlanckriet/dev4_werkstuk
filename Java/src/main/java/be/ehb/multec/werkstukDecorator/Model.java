package be.ehb.multec.werkstukDecorator;

public abstract class Model {
    public static String getDescription;
    protected String description;

    protected void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    protected abstract double cost();
}
