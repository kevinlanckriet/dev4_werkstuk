package be.ehb.multec.werkstukDecorator;


public class UpgradeModel1 extends ModelDecorator {
    public UpgradeModel1(Model model) {
        super(model);
        super.setDescription(", upgrade package 1 added.");
    }
    @Override
    public double cost() {

        return super.cost() + 2500;
    }

    public String getDescription() {
        return super.model.getDescription() + super.getDescription();
    }
}