package org.jie6mm.nobug.biz.produce;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;


/**
 * @author JIE6MM
 */
@SpringBootApplication
@PropertySource(value = {
		"file:${test.file-path}"
}, encoding="UTF-8")
public class BizProduceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BizProduceApplication.class, args);
	}

	@Value("${test.name:null}")
	private String test;

	@PostConstruct
	public void init() {
		System.out.println("test.name=" + test);
	}
}
