package t1;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Project name(项目名称)：MyBatis_insert
 * Package(包名): t1
 * Interface(接口名): SiteMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/12
 * Time(创建时间)： 19:17
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface SiteMapper
{
    int addSiteByMap(Map<String, String> params);

    int addWebsiteByParam(@Param("name") String name, @Param("url") String url, @Param("age") String age);

    int addSiteByByBean(@Param("site") Site site);
}
