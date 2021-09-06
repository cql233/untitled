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
    @Autowired
    RestHighLevelClient restHighLevelClient;
    @Test
    public void printClient(){

        System.out.println(restHighLevelClient);
    }
}
