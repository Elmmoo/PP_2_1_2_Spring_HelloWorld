import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        HelloWorld bean1 = (HelloWorld) context.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) context.getBean("helloworld");


        bean2.setMessage("New Message");


        System.out.println("First HelloWorld: " + bean1.getMessage());
        System.out.println("Second HelloWorld : " + bean2.getMessage());

        Cat cat1 = (Cat) context.getBean("cat");
        Cat cat2 = (Cat) context.getBean("cat");
        Cat cat3 = (Cat) context.getBean("cat");


        cat1.setName("Tom");
        cat2.setName("Jack");

        System.out.println("First Cat: " + cat1.getName());
        System.out.println("Second Cat: " + cat2.getName());
        System.out.println("Third Cat: " + cat3.getName());
    }
}