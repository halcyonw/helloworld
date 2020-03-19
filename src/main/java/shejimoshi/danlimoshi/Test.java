package shejimoshi.danlimoshi;

public class Test {
    public static void main(String[] args) {
        LoadBalancer b1,b2,b3,b4;
        b1=LoadBalancer.getLoadBalancer();
        b2=LoadBalancer.getLoadBalancer();
        b3=LoadBalancer.getLoadBalancer();
        b4=LoadBalancer.getLoadBalancer();
        if (b1 == b2 && b2 == b3 && b3 == b4) {
            System.out.println("服务器唯一");
        }
        b1.addServer("server1");
        b2.addServer("server2");
        b3.addServer("server3");
        b4.addServer("server4");

        for (int i = 0; i < 10; i++) {
            String server=b1.getServer();
            System.out.println("分发请求至服务器"+server);
        }
    }
}
