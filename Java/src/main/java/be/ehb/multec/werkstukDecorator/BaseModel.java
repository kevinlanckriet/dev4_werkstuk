package be.ehb.multec.werkstukDecorator;

public class BaseModel extends Model{
    public BaseModel() {
        setDescription("Base car setup");
        setIdentifier("BA");
    }
    @Override
    protected int referenceCode() {
        return 14;
    }


}