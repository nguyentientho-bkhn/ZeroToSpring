package vn.com.zerotospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vn.com.zerotospring.diandioc.Girl;
import vn.com.zerotospring.diandioc.Outfit;

@SpringBootApplication
public class ZeroToSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ZeroToSpringApplication.class, args);

        Outfit outfit = context.getBean(Outfit.class);
        Girl girl = context.getBean(Girl.class);

        System.out.println("show outfit = " + outfit);
        System.out.println("show girl = " + girl);
        System.out.println("show outfit through from girl = " + girl.getOutfit());

        outfit.wear();
        girl.getOutfit();

    }

}
