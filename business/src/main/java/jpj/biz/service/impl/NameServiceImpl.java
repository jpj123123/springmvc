package jpj.biz.service.impl;

import jpj.biz.dao.NameMapper;
import jpj.biz.entity.Name;
import jpj.biz.service.NameService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author: jingpj
 * @Date：creste in 2019/7/31
 */
@Service
public class NameServiceImpl implements NameService {
  @Resource
  private NameMapper mapper;
  @Override
  @Transactional
  public void addName(long id) {
	Name name  = mapper.selectByPrimaryKey(75002L);
	name.setId(null);
	mapper.insert(name);
	mapper.insert(name);

//	throw new RuntimeException("出错了！！");
  }
}
