package com.jk;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml"})
@MapperScan("com.jk.mapper")
public class FuwuduanApplication {

    public static void main(String[] args) {

        SpringApplication.run(FuwuduanApplication.class, args);

    }
}