package com.example.springbootlog4j2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLog4j2Application {
	/**
	 * 配置属性
	 * 获取监听器，发布应用开始启动事件
	 * 初始化输入参数
	 * 配置环境，输出banner
	 * 创建上下文
	 * 预处理上下文
	 * 刷新上下文
	 * 再刷新上下文
	 * 发布应用已经启动事件
	 * 发布应用启动完成事件
	 *
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLog4j2Application.class, args);
	}

}
