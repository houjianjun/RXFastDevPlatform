package com.xtwy.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @作者： 侯建军
 * 
 * @日期：2018年5月14日 下午12:57:42
 * @公司：迅腾伟业
 * @描述：过滤器类
 */
@Configuration
public class WebConfiguration {
	@Bean
	public RemoteIpFilter remoteIpFilter() {
		//返回一个远程IP过滤器对象
		return new RemoteIpFilter();
	}

	@Bean
	public FilterRegistrationBean testFilterRegistration() {
		
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MyFilter());
		//设置过滤器路径
		registration.addUrlPatterns("/*");
		//添加初始始化参数
		registration.addInitParameter("paramName", "paramValue");
		//注册过滤器类
		registration.setName("MyFilter");
		registration.setOrder(1);
		return registration;
	}
	
}
