package com.evan.study_spb2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.evan.study_spb2.mapper")
public class StudySpb2Application {

	public static void main(String[] args) {
		SpringApplication.run(StudySpb2Application.class, args);
	}

}
