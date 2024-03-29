package com.cql.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "elasticsearch")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElasticsearchConfig {
    private String host;
    private int port;
    private String scheme;
    private int connectionTimeOut;
    private int socketTimeOut;
    private int connectionRequestTimeOut;
    private int maxConnectNum;
    private int maxConnectPerRoute;
    @Bean(name = "restHighLevelClient")
    public RestHighLevelClient client(){
        HttpHost host2=new HttpHost(host,port,scheme);
        RestClientBuilder builder=RestClient.builder(host2);
        return new RestHighLevelClient(builder);
    }
}
