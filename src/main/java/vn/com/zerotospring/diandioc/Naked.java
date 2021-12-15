package vn.com.zerotospring.diandioc;

import org.springframework.stereotype.Component;

@Component
public class Naked implements Outfit{
    @Override
    public void wear() {
        System.out.println("This is naked");
    }
}
