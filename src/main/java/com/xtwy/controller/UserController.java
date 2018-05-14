package com.xtwy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @作者： 侯建军
 * @日期：2018年5月14日 上午11:36:34
 * @公司：迅腾伟业
 * @描述：用户控制器类
 */
@RestController
public class UserController {
	@GetMapping("/index")
    public String index() {
        return "spring boot";
    }
}
