package com.xtwy.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 设为主键 唯一不能为空
	 * nullable 是否可以为空
	 * unique 唯一
	 * @GeneratedValue
	 * 就是为一个实体生成一个唯一标识的主键
	 * (JPA要求每一个实体Entity,必须有且只有一个主键)
	 * @GeneratedValue提供了主键的生成策略。
	 * 。@GeneratedValue注解有两个属性,分别是strategy和generator,
	 * 其中generator属性的值是一个字符串,默认为"",其声明了主键生成器的名称
	 * (对应于同名的主键生成器@SequenceGenerator和@TableGenerator)。
	 *  JPA为开发人员提供了四种主键生成策略,其被定义在枚举类GenerationType中,
	 *  包括GenerationType.TABLE,GenerationType.SEQUENCE,
	 *  GenerationType.IDENTITY和GenerationType.AUTO。
	 *  这里生成策略为自增长
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long id;
	@Column(nullable = false, unique = true)
	private String userName;
	@Column(nullable = false)
	private String passWord;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = true, unique = true)
	private String nickName;
	@Column(nullable = false)
	private String regTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
}