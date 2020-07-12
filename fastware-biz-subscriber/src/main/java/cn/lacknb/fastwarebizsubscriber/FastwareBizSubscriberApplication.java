package cn.lacknb.fastwarebizsubscriber;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class FastwareBizSubscriberApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastwareBizSubscriberApplication.class, args);
    }

}
