package test;

import com.alibaba.fastjson.JSON;
import jpj.biz.dao.NameMapper;
import jpj.biz.entity.Name;
import jpj.biz.service.NameService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Author: jingpj
 * @Date：creste in 2019/7/31
 */
public class NameTest extends BaseTest {
  @Resource
  private NameMapper mapper;
  @Autowired
  private NameService nameService;
  @Test
  public void test(){
	Name name = new Name();
	name.setName("jing1");
	name.setCreateTime(new Date());
	name.setUpdaetTime(new Date());
	mapper.insert(name);
  }

  @Test
  public void test2(){

	Name name  = mapper.selectByPrimaryKey(75002L);
	System.out.println(JSON.toJSONString(name));
  }
  @Test
  public void test3(){

	nameService.addName(75002L);
  }
}
