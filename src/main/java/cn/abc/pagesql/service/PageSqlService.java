package cn.abc.pagesql.service;

import cn.abc.pagesql.utils.Result;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: pagesql
 * @Package: cn.abc.pagesql.service
 * @ClassName: PageSqlService
 * @Author: 柴玺
 * @Description:
 * @Date: 2021/12/30 15:06
 * @Version: 1.0
 */
public interface PageSqlService {

    Result ItemList(String sql);


}
