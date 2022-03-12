package t1;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/**
 * Project name(项目名称)：MyBatis_insert
 * Package(包名): t1
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/12
 * Time(创建时间)： 19:20
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args) throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SiteMapper mapper = sqlSession.getMapper(SiteMapper.class);
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "百度");
        map.put("url", "www.baidu.com");
        map.put("age", "17");
        //int i = mapper.addSiteByMap(map);
        //int i = mapper.addWebsiteByParam("百度", "www.baidu.com", "11");
        Site site = new Site();
        site.setName("百度");
        site.setUrl("www.baidu.com");
        site.setAge(13);
        int i = mapper.addSiteByByBean(site);

        sqlSession.commit();
        System.out.println(i);
    }
}
