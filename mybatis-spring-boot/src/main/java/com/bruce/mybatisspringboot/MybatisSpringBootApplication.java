package com.bruce.mybatisspringboot;

import com.bruce.mybatisspringboot.mapper.CountryMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.bruce.mapper", "com.bruce.mybatisspringboot.mapper"}, nameGenerator = MapperNameGenerator.class)
public class MybatisSpringBootApplication implements CommandLineRunner {

    @Autowired
    private com.bruce.mybatisspringboot.mapper.CountryMapper countryMapper;

    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        countryMapper.selectAll();
    }
}
