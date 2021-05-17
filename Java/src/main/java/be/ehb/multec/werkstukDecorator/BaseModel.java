package be.ehb.multec.werkstukDecorator;

public class BaseModel extends Model{
    public BaseModel() {
        setDescription("Base car setup");
    }

    @Override
    protected double cost() {
        return 10000;
    }
}