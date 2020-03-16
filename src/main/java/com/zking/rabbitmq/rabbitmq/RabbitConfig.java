package com.zking.rabbitmq.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 配置类主要用来配置队列、交换器、路由等高级信息
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue(){
        return new Queue("queue-first");
    }
}
