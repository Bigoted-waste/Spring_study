import com.pojo.hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        /* 获取Spring的上下文对象!
         * context 上下文
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //对象都在Spring中管理
        hello hello1 = (hello) context.getBean("hello");
        System.out.println(hello1.toString());
    }
}
