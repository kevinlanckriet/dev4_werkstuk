package be.ehb.multec.werkstukDecorator;

public class ModelDecorator extends Model{
    protected Model model;
    protected ModelDecorator(Model model) {
        this.model = model;
    }

    protected double cost() {
        return model.cost();
    }
}