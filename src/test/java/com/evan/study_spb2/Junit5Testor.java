package com.evan.study_spb2;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Junit5Testor {

    @BeforeAll
    public void initDB(){
        System.out.println("正在创建数据库");
    }

    @BeforeEach
    public void initData(){
        System.out.println("正在初始化数据");
    }

    @AfterEach
    public void destroyData(){
        System.out.println("正在销毁数据");
    }

    @Test
    public void firstTestCase(){
        System.out.println("我是第1个测试用例");
    }


    @Test
    public void secondTestCase(){
        System.out.println("我是第2个测试用例");
    }

    @AfterAll
    public void destroyDB(){
        System.out.println("正在销毁数据库");
    }

}
