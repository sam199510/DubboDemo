import com.dubbo.demo.service.DemoProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author sam199510 273045049@qq.com
 * @version Created Time:2018/3/30 18:33:05
 */
public class ConsumerTest2 {

    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();

        DemoProviderService demoProviderService = (DemoProviderService) context.getBean("demoProviderService");
        Integer result = demoProviderService.getStringLength("Sam");
        System.out.println("远程调用的结果：" + result);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        context.close();
    }

}
