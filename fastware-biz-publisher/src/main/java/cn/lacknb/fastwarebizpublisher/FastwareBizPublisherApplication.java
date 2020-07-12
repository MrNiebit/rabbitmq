package cn.lacknb.fastwarebizpublisher;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class FastwareBizPublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastwareBizPublisherApplication.class, args);
    }

}
