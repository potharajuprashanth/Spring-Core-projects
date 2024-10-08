package com.zoopark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {

    private Lion lion;

    // Inject lion2 bean using @Qualifier
    @Autowired
    public Zoo(@Qualifier("lion") Lion lion) {
        System.out.println("====Lion is created inside the Zoo using Constructor====");
        this.lion = lion;
    }

    public Lion getLion() {
        return lion;
    }

    public void setLion(Lion lion) {
        this.lion = lion;
    }
}
