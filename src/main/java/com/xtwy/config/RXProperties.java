package com.xtwy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @作者： 侯建军
 * @日期：2018年5月14日 下午1:16:23
 * @公司：迅腾伟业
 * @描述：睿迅自定义配置
 */
@Component
public class RXProperties {
	@Value("${com.rx.title}")
	private String title;
	@Value("${com.rx.description}")
	private String description;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
