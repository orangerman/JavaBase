package team.server;

/**
 * @author java_fan
 * @description
 * @create 2019-05-09 16:07
 */
public class Status {
    private final String NAME;
    private Status(String name){
        this.NAME =  name;
    }
    public static final  Status FREE = new Status("FREE");
    public static final  Status BUSY = new Status("BUSY");
    public static final  Status VOCATION = new Status("VACATION");

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
