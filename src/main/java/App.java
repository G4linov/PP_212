import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean.getMessage());

        HelloWorld secondHelloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean == secondHelloWorldBean);

        Cat catFirst = applicationContext.getBean("cat", Cat.class);
        Cat catSecond = applicationContext.getBean("cat", Cat.class);

        System.out.println(catFirst == catSecond);
    }
}