package be.ehb.multec.werkstukFactory;

public class SEDAN extends Car {

    private String trimGrade;
    private int assemblyLine;


    public SEDAN(String trimGrade){
        this.trimGrade=trimGrade;
        this.assemblyLine = 0;
    }

    @Override
    public String getTrim() {
        return this.trimGrade;
    }

    @Override
    public int getassemblyLine() {
        return this.assemblyLine;
    }


}