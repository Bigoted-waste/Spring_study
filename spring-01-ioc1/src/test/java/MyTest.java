
import com.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //用户实际调用的是业务层 , dao层不需要接触
//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDaoOracleImpl());
//
//        userService.getUser();
        /*  总结
            之前，程序是主动创建对象！控制权在程序员手上！
            使用了set注入后，程序不再具有主动性，而是变成了被动的接受对象！
         */

        //获取ApplicationContext;
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}
