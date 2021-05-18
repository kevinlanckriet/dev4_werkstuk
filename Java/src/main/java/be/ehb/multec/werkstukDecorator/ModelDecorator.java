package be.ehb.multec.werkstukDecorator;

public class ModelDecorator extends Model{
    protected Model model;
    protected ModelDecorator(Model model) {
        this.model = model;
    }

    protected int referenceCode() {
        return model.referenceCode();
    }

}