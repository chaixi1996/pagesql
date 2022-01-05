package cn.abc.pagesql.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: pagesql
 * @Package: cn.abc.pagesql.cn.abc.pagesql.dao
 * @ClassName: PageSqlDao
 * @Author: 柴玺
 * @Description:
 * @Date: 2021/12/30 15:13
 * @Version: 1.0
 */
@Mapper
public interface PageSqlDao {

    public List<Map<String, Object>> selectPublicItemList(@Param(value="sqlStr") String sqlStr);

}
