package cn.abc.pagesql.service.impl;

import cn.abc.pagesql.dao.PageSqlDao;
import cn.abc.pagesql.service.PageSqlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
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
    public List<Map<String, Object>> selectPublicItemList(String sql) {
        List<Map<String, Object>> maps = pageSqlMapper.selectPublicItemList(sql);
        return maps;
    }
}
