package ru.vtb;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;
import ru.dionisis.springdemo.SpringDemoApplication;

@Import(SpringDemoApplication.class)
public class SpringConfig {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfig.class, args);
    }
}
