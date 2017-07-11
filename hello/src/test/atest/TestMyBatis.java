import code.domain.User;
import code.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * Created by Lr on 2017/7/10.
 */



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    private ApplicationContext ac = null;

    @Resource
    private IUserService userService = null;

    @Before
    public void before(){
        ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        userService = (IUserService) ac.getBean("userService");
    }

    @Test
    public void test1(){
        User user = userService.gerUserById(1);
        System.out.print(user.getuName());
    }
}
