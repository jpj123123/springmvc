package jpj.core.mybatisplugin.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author: jingpj
 * @Date：creste in 2019/7/31
 */
public class MyDatasoure extends AbstractRoutingDataSource {
  @Override
  protected Object determineCurrentLookupKey() {
	return DataSourceHelper.get();
  }
}
