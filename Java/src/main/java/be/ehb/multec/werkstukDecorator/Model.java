package be.ehb.multec.werkstukDecorator;

public abstract class Model extends Main{
    public static String getDescription;
    protected String description;
    protected String name;

    protected void setDescription(String description) {
        this.description = description;
    }
    protected void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }


    protected String identifier;

    protected void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    protected String getIdentifier() {
        return identifier;
    }
    protected abstract int referenceCode();

}
