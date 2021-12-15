package vn.com.zerotospring.diandioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Girl {
    Outfit outfit;

    @Autowired
    public Girl(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }


}
