package team.server;

/**
 * @author java_fan
 * @description 自定义异常类
 * @create 2019-05-10 10:49
 */
public class TeamException extends Exception {
    static final long serialVersionUID = -3397514229948L;

    public TeamException(){

    }
    public TeamException(String msg){
        super(msg);
    }
}
