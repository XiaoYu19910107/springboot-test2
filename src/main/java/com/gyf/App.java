package com.gyf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@MapperScan(basePackages = "com.gyf.mapper")
//@ComponentScan(basePackages = {"com.gyf.datasource","com.gyf.web","com.gyf.test1.service","com.gyf.test2.service"})
@ComponentScan(basePackages = {"com.gyf"})
//@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class App
{
    public static void main( String[] args )

    {
        SpringApplication.run(App.class,args);
    }
}
