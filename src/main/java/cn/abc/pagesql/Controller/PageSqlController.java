package cn.abc.pagesql.Controller;

import cn.abc.pagesql.service.PageSqlService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;


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
    @PostMapping("/sql")
    public void pageSql() {
        String sql ="select * from GAP_USER;";
        List<Map<String, Object>> maps = pageSqlService.selectPublicItemList(sql);
        for (Map<String, Object> map : maps) {

            Set<Map.Entry<String, Object>> entries = map.entrySet();
            for (Map.Entry<String, Object> entry : entries) {
                String s = entry.getKey() + ":::::" + entry.getValue();
                System.out.println(s);
            }
        }
    }
}
