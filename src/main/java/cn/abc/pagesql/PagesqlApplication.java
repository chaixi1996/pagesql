package cn.abc.pagesql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ="cn.abc.pagesql.dao")
public class PagesqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagesqlApplication.class, args);
    }

}
