package com.ymbj.ordertest.configurations;

import com.ymbj.ordertest.configurations.beans.LiteBean2;
import com.ymbj.ordertest.configurations.beans.LiteBean3;
import com.ymbj.ordertest.configurations.beans.LiteMemberBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

// 结论：
// TODO 待分析：看到有博客说即使普通的不标注@Component注解的类的@Bean方法也是Lite模式，但验证liteBean3这个bean没创建(即使自己通過@bean方式将LiteConfiguration2放入了容器)，自己翻源码分析
public class LiteConfiguration2 {

	public LiteConfiguration2() {
		System.out.println("=========configurations.LiteConfiguration2 Constructor============");
	}


	@Bean
	public LiteBean3 liteBean3() {
		System.out.println("=========configurations.LiteBean3============");
		return new LiteBean3();
	}

}
