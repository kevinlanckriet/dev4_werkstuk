package be.ehb.multec.werkstukFactory;

public abstract class AssemblyBaseModel {

    public static String getDescription;
    protected String description;
    // andere features hier

    protected void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
