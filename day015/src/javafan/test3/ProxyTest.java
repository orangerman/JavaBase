package javafan.test3;

/**
 * @author java_fan
 * @create 2019-05-06 13:21
 */

/**
 * 接口的应用：代理模式
 */
public class ProxyTest {
    public static void main(String[] args) {
        Server server= new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.brow();
    }
}
interface NetWork{

    void brow();
}
//被代理类
class Server implements NetWork{
    @Override
    public void brow() {
        System.out.println("真实的服务器访问网络");
    }
}
//代理类
class ProxyServer implements NetWork{
    private NetWork work;
    public ProxyServer(NetWork work){
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }
    public void loading(){
        System.out.println("登录账号");
    }
    @Override
    public void brow() {
        check();
        loading();
        work.brow();

    }
}
