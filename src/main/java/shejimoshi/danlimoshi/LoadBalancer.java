package shejimoshi.danlimoshi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//负载均衡器LoadBalancer：单例类，真实环境下该类将非常复杂，包括大量初始化的工作和业务方法
public class LoadBalancer {
    //私有静态成员变量，存储唯一实例


    private List serverList=null;

    private LoadBalancer() {
        serverList = new ArrayList();
    }

    private static class HolderClass{
        private  static LoadBalancer balancer = new LoadBalancer();
    }

    //公有静态成员方法，返回唯一实例
    public static LoadBalancer getLoadBalancer() {
        return HolderClass.balancer;
    }

    //增加服务器
    public void addServer(String server) {
        serverList.add(server);
    }

    //删除服务器
    public void removeServer(String server) {
        serverList.remove(server);
    }

    //随机获取服务器
    public String getServer() {
        Random r = new Random();
        int i = r.nextInt(serverList.size());
        return (String) serverList.get(i);
    }

    public static void main(String[] args) {
        LoadBalancer l1,l2;
        l1 = LoadBalancer.getLoadBalancer();
        l2 = LoadBalancer.getLoadBalancer();
       l2.addServer("22");
        System.out.println(l2.getServer());
    }
}
