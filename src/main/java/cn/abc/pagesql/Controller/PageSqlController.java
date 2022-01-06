package cn.abc.pagesql.Controller;

import cn.abc.pagesql.service.PageSqlService;
import cn.abc.pagesql.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;



/**
 * @ProjectName: pagesql
 * @Package: cn.abc.pagesql.Controller
 * @ClassName: PageSqlController
 * @Author: 柴玺
 * @Description:
 * @Date: 2021/12/30 15:04
 * @Version: 1.0
 */
@Controller
@RequestMapping("/page")
public class PageSqlController {

    @Resource
    private PageSqlService pageSqlService;

    /**
     * 接收前端传入的数据
     */
    @GetMapping ("/sql")
    public Result pageSql(@RequestParam(value = "sql") String sql) {
        /*String sql1 = "insert into GAP_USER values (6,'王麻子','浙江省','33','男')";
        String sql2 = "delete from GAP_USER where ID=6 and NAME='王麻子'";
        String sql3 = "update GAP_USER set NAME='张三',ID=1 where ADDRESS='浙江省'";
        String sql ="select * from GAP_USER";*/
        Result result = pageSqlService.ItemList(sql);
        return result;

    }
}
