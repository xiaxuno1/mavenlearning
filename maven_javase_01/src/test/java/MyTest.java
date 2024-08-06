import com.maven.demo.Hello;
import org.junit.Test;

public class MyTest {
    /**
     * 测试功能由测试方法来实现
     * 测试方法的规范
     * 1)访问权限是public
     * 2)方法没有返回值void
     * 3)方法名称自 定义,推荐以test开头
     * 4)方法没有参数
     * 5)使用@Test注解声明是测试方法
     */
    @Test
    public void testSum(){
        Hello hello = new Hello();
        System.out.println(hello.sum(3,6));
    }
    @Test
    public void testMul(){
        Hello  hello = new Hello();
        System.out.println(hello.mul(3,6));
    }

}
