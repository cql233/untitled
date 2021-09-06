package com.cql.util;

import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest(classes = ElasticsearchConfig.class)
@EnableConfigurationProperties
public class ESClientTest {
    @Test
    public void printClient(){
        ApplicationContext  context= new AnnotationConfigApplicationContext(ElasticsearchConfig.class);
        RestHighLevelClient client=context.getBean("restHighLevelClient",RestHighLevelClient.class);
        System.out.println(client);
    }
}
