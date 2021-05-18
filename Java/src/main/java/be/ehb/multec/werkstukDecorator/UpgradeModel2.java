package be.ehb.multec.werkstukDecorator;


public class UpgradeModel2 extends ModelDecorator {
    public UpgradeModel2(Model model) {
        super(model);
        super.setDescription(", upgrade package 2 added.");
        super.setIdentifier("U2");
    }
    @Override
    protected int referenceCode() {
        return super.referenceCode() + 7;
    }

    public String getDescription() {
        return super.model.getDescription() + super.getDescription();
    }
    public String getIdentifier() {
        return super.model.getIdentifier() + super.getIdentifier();
    }

}