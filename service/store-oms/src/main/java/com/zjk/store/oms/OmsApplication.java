package com.zjk.store.oms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName:OmsApplication
 * @Description:
 * @Author:Zhou Jingkai
 * @Data:2022-01-11 22:39
 * @Version:1.0
 **/
@SpringBootApplication
@MapperScan({"com.zjk.store.oms.mapper"})
public class OmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(OmsApplication.class,args);
    }
}
