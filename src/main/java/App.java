import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Второй вызов: " + bean2.getMessage());

        System.out.println(bean == bean2);

        Cat bean3 = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean3.getMessage());

        Cat bean4 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Второй вызов: " + bean4.getMessage());

        System.out.println(bean3 == bean4);
    }
}