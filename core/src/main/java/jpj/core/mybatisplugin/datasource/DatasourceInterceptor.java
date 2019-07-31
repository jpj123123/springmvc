package jpj.core.mybatisplugin.datasource;

import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * @Author: jingpj
 * @Date：creste in 2019/7/31
 */
@Intercepts({
  @Signature(
	type = Executor.class,
	method = "query",
	args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}
  ), @Signature(
	type = Executor.class,
	method = "query",
	args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}
  ),
  @Signature(
	type = Executor.class,
	method = "update",
	args = {MappedStatement.class, Object.class}
  )
})
public class DatasourceInterceptor implements Interceptor{
  public DatasourceInterceptor() {
  }

  @Override
  public Object intercept(Invocation invocation) throws Throwable {
    try {

	  MappedStatement ms = (MappedStatement)invocation.getArgs()[0];
	  if(SqlCommandType.SELECT == ms.getSqlCommandType()){
		System.out.println("进入读库");
		DataSourceHelper.set(DataSourceEnum.READ);
	  }else {
		System.out.println("进入写库");
		DataSourceHelper.set(DataSourceEnum.WRITER);
	  }
	}catch (Exception e){

	}
	return invocation.proceed();
  }

  @Override
  public Object plugin(Object target) {
	return Plugin.wrap(target, this);
  }

  @Override
  public void setProperties(Properties properties) {

  }
}
