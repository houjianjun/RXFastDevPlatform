package com.xtwy.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtwy.domain.entity.User;
/**
 * 
 * @作者： 侯建军
 * @日期：2018年5月14日 下午2:07:31
 * @公司：迅腾伟业
 * @描述：用户Dao类
 * @Repository 不加添也可以
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
