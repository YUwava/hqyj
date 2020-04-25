package com.athqyj.hqyj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@MapperScan(basePackages = "Mapper.ym.InfomationMapper")*/
public class HqyjApplication {

    public static void main(String[] args) {
        SpringApplication.run(HqyjApplication.class, args);
    }

}
