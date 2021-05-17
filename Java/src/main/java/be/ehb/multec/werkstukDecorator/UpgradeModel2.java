package be.ehb.multec.werkstukDecorator;


public class UpgradeModel2 extends ModelDecorator {
    public UpgradeModel2(Model model) {
        super(model);
        super.setDescription(", upgrade package 2 added.");
    }
    @Override
    public double cost() {

        return super.cost() + 3500;
    }

    public String getDescription() {
        return super.model.getDescription() + super.getDescription();
    }
}