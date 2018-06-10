import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author sam199510 273045049@qq.com
 * @version Created Time:2018/3/30 16:07:04
 */
public class ProviderTest {

    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        System.out.println("服务提供者注向zookeeper注册中心注册服务成功（端口：20880）");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        context.close();
    }

}
