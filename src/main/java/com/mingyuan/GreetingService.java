package com.mingyuan;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by zhumingyuan on 13/6/20
 */
@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "hello " + name;
    }
}
