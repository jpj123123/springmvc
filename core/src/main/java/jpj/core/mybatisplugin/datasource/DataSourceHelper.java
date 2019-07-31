package jpj.core.mybatisplugin.datasource;

/**
 * @Author: jingpj
 * @Date：creste in 2019/7/31
 */
public class DataSourceHelper {
  protected static ThreadLocal<DataSourceEnum> local  = new ThreadLocal<>();
  public static DataSourceEnum get(){
    return local.get();
  }
  public static void set(DataSourceEnum dataSourceEnum){
	local.set(dataSourceEnum);
  }
}
