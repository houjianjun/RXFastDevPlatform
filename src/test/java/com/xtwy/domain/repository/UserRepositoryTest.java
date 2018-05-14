package com.xtwy.domain.repository;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xtwy.domain.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {
	// 获取Dao对象
	@Autowired
	private UserRepository userRepository;

	/**
	 * 查询所有
	 */
	@Test
	public void testFindAll() {
		List<User> list = userRepository.findAll();
		System.out.println(list.size());
	}

	@Test
	public void testFindAllSort() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllByIdIterableOfID() {
		fail("Not yet implemented");
	}

	/**
	 * 添加记录
	 */
	@Test
	public void testSave() {
		User user = new User();
		user.setUserName("admin");
		user.setNickName("管理员");
		user.setPassWord("123456");
		user.setRegTime("2018-05-14");
		user.setEmail("474177818@qq.com");
		// 默认为自动提交
		userRepository.save(user);

	}

	/**
	 * 批量添加
	 */
	@Test
	public void testSaveAll() {
		User user = new User();
		user.setUserName("admin");
		user.setNickName("管理员");
		user.setPassWord("123456");
		user.setRegTime("2018-05-14");
		user.setEmail("474177818@qq.com");
		List<User> users = new ArrayList<>();
		users.add(user);
		// 保存多个
		userRepository.saveAll(users);
	}

	@Test
	public void testFlush() {
		fail("Not yet implemented");
	}
	/**
     * 更新也是根据主键来更新  update XX  xx where id=1
     */
	@Test
	public void testSaveAndFlush() {
		User user = new User();
		//如果设有主键值则为更新，否则为添加
		user.setId(1L);
		user.setUserName("admin");
		user.setNickName("管理员");
		user.setPassWord("******");
		user.setRegTime("2018-05-14");
		user.setEmail("474177818@qq.com");
		// 保存或更新,在高并发下建议用saveAndFlush
		// 保存并强制同步
		userRepository.saveAndFlush(user);
	}
	
	/**
	 * 批量更新
	 */
	public void testUpdateBath() {
		
	}

	/**
	 * 根据主键删除
	 */
	@Test
	public void testDeleteById() {
		// 删除单条,根据主键值,数据类型为长整型
		userRepository.deleteById(20L);
	}
	/**
	 * 删除所有
	 */
	@Test
	public void testDeleteAll() {
		// 删除所有
		// 删除全部,先findALL查找出来,再一条一条删除,最后提交事务
		userRepository.deleteAll();

	}
	/**
	 * 按集合删除
	 */
	@Test
	public void testDeleteInBatch() {
		User user = new User();
		user.setUserName("admin");
		user.setNickName("管理员");
		user.setPassWord("123456");
		user.setRegTime("2018-05-14");
		user.setEmail("474177818@qq.com");
		List<User> users = new ArrayList<>();
		users.add(user);
		// 删除集合,一条sql,拼接or语句 如 id=1 or id=2
		userRepository.deleteInBatch(users);
	}
	/**
	 * 删除全部
	 */
	@Test
	public void testDeleteAllInBatch() {
		// 删除全部,一条sql
		userRepository.deleteAllInBatch();
	}

	@Test
	public void testGetOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllExampleOfS() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllExampleOfSSort() {
		fail("Not yet implemented");
	}

}
