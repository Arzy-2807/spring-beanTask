package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());


        HelloWorld bean2 =
                applicationContext.getBean("helloworld",HelloWorld.class);
        System.out.println(bean.getMessage());



        Cat  cat1 =(Cat) applicationContext.getBean("getCat");
        cat1.meou();

          Cat cat2 = applicationContext.getBean("getCat",Cat.class);
          cat2.meou();

        System.out.println("Are HelloWorld's objects equal?: " );
        System.out.println(bean == bean2);
        System.out.println("Are the cat's objects equal? ");
        System.out.println(cat1==cat2);
    }
}
