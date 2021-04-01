package hust.CAD;

import com.github.pagehelper.PageHelper;
import hust.CAD.domain.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperTest {

    @Test
    public void test1() throws IOException {
        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);//建立会话时，传入true可以自动提交事务


        PageHelper.startPage(1,2);

        List<User> list = sqlSession.selectList("userMapper.findAll");
        for (User user : list) {
            System.out.println(user);
        }

    }

}
