package cn.lacknb.fastwarebizsubscriber.service;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 业务代码
 * 只要被容器扫描到即可
 * @author Administrator
 */
@Component
public class EmailReceiverListening {


    /**
     * 注解监听 指定的队列，可以监听多个。
     * queues = "emailQueue"
     * @param msg 收到的消息。
     * durable = true 开启 持久化
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "emailQueue", durable = "true"),
            exchange = @Exchange(
                    value = "emailExchange",
                    ignoreDeclarationExceptions = "true",  // 忽略异常
                    type = ExchangeTypes.DIRECT  // topic模式支持通配符
            ),
            key = {"emailRouting"}
    ))
    public void receiver (String msg) {
        System.out.println("收到的消息是：" + msg);
    }



    /**
     * direct 和 topic模式 相同的是 都需要 routingkey
     * 但是 topic 支持通配符。
     * */

}
