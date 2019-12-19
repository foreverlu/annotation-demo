import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by caoweiwei on 2019/12/14.
 */
public class LogTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        com.log.LogTest logTest = ac.getBean(com.log.LogTest.class);
        System.out.println(logTest.logTest("password"));

    }
}
