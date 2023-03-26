import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");


        Cat catBean1 = applicationContext.getBean(Cat.class);
        Cat catBean2 = applicationContext.getBean(Cat.class);

        System.out.println(bean1 == bean2);
        System.out.println(catBean1 == catBean2);
        System.out.println(catBean1);
        System.out.println(catBean2);

    }
}