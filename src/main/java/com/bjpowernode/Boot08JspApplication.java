package com.bjpowernode;

import com.bjpowernode.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Boot08JspApplication {

	public static void main(String[] args) {

		//run方法的返回值就是容器对象
		ApplicationContext ctx = SpringApplication.run(Boot08JspApplication.class, args);

		UserService service = (UserService) ctx.getBean("userService");

		service.add("lisi",20);
	}

}
