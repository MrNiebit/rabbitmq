package cn.lacknb.fastwarebizsubscriber.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailConfig {

    private static final String QUEUE_NAME = "emailQueue";
    private static final String EXCHANGE_NAME = "emailExchange";
    private static final String ROUTING_KEY = "emailRouting";



    /**
     * 交换机 指定 对应的name
     * @return
     */
    @Bean
    public DirectExchange emailExchange () {
        return new DirectExchange(EXCHANGE_NAME);
    }

    /**
     * 队列
     * @return
     */
    @Bean
    public Queue emailQueue () {
        return new Queue(QUEUE_NAME);
    }

    /**
     * 绑定 队列 交换机 routingKey
     * @return
     */
    @Bean
    public Binding bindingEmail () {
        return BindingBuilder.bind(emailQueue()).to(emailExchange()).with(ROUTING_KEY);
    }

}
