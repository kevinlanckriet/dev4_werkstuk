package be.ehb.multec.werkstukDecorator;


public class UpgradeModel1 extends ModelDecorator {
    public UpgradeModel1(Model model) {
        super(model);
        super.setDescription(", upgrade package 1 added.");
        super.setIdentifier("U1");
    }
    @Override
    protected int referenceCode() {
        return super.referenceCode() + 6;
    }

    public String getDescription() {
        return super.model.getDescription() + super.getDescription();
    }
    public String getIdentifier() {
        return super.model.getIdentifier() + super.getIdentifier();
    }
}