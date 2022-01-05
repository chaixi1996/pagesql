package cn.abc.pagesql;

import cn.abc.pagesql.dao.PageSqlDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: pagesql
 * @Package: cn.abc.pagesql
 * @ClassName: Test1
 * @Author: 柴玺
 * @Description:
 * @Date: 2022/1/5 10:49
 * @Version: 1.0
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class Test1 {


        @Autowired
        private PageSqlDao pageSqlDao;
        @Test
        public void getPublicData(){
            String sql = "select id,age,password,sex,username from user where id = 1";
            List<Map<String, Object>> list = pageSqlDao.selectPublicItemList(sql);

    }
}
