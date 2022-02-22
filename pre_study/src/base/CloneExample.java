package base;

public class CloneExample implements Cloneable{
    private int a;
    private int b;

    @Override
    public CloneExample clone() throws CloneNotSupportedException{
        return (CloneExample)super.clone();
    }
}
