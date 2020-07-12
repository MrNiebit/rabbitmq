package cn.lacknb.fastwarebizpublisher.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailConfig {

    private static final String EXCHANGE_NAME = "emailExchange";


    /**
     * 交换机 指定 对应的name
     * @return
     */
    @Bean
    public DirectExchange emailExchange () {
        return new DirectExchange(EXCHANGE_NAME);
    }

}
