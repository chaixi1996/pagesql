package cn.abc.pagesql.service.impl;

import cn.abc.pagesql.dao.PageSqlDao;
import cn.abc.pagesql.service.PageSqlService;
import cn.abc.pagesql.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: pagesql
 * @Package: cn.abc.pagesql.service.impl
 * @ClassName: PageSqlServiceImpl
 * @Author: 柴玺
 * @Description:
 * @Date: 2021/12/30 15:12
 * @Version: 1.0
 */
@Service
public class PageSqlServiceImpl implements PageSqlService {
    @Resource
    private PageSqlDao pageSqlMapper;


    @Override
    public Result ItemList(String sql) {
        Result result = new Result();
        String substring = sql.substring(0, 1);
        if ("s".equals(substring)) {
            try {
                List<Map<String, Object>> maps = pageSqlMapper.selectPublicItemList(sql);
                result.setFlag(1);
                result.setMaps(maps);
            } catch (Exception e) {
                result.setFlag(3);
                result.setMessage(e.getMessage());
            }
        } else if ("u".equals(substring)) {
            try {
                Integer updateInt = pageSqlMapper.updatePublicItemList(sql);
                result.setFlag(2);
                result.setFind(updateInt);
            } catch (Exception e) {
                result.setFlag(3);
                result.setMessage(e.getMessage());
            }
        } else if ("i".equals(substring)) {
            try {
                Integer insertInt = pageSqlMapper.insertPublicItemList(sql);
                result.setFlag(2);
                result.setFind(insertInt);
            } catch (Exception e) {
                result.setFlag(3);
                result.setMessage(e.getMessage());
            }
        } else if ("d".equals(substring)) {
            try {
                Integer delint = pageSqlMapper.deletePublicItemList(sql);
                result.setFlag(2);
                result.setFind(delint);
            } catch (Exception e) {
                result.setFlag(3);
                result.setMessage(e.getMessage());
            }
        }
        return result;
    }
}
