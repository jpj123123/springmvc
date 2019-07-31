package jpj.biz.dao;

import jpj.biz.entity.Name;

public interface NameMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Name record);

    int insertSelective(Name record);

    Name selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Name record);

    int updateByPrimaryKey(Name record);
}