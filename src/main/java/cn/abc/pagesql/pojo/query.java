package cn.abc.pagesql.pojo;

import java.io.Serializable;

/**
 * @ProjectName: pagesql
 * @Package: cn.abc.pagesql.pojo
 * @ClassName: query
 * @Author: 柴玺
 * @Description:
 * @Date: 2022/1/5 10:17
 * @Version: 1.0
 */
public class query implements Serializable {
    private String sql;

    public query() {
    }

    public query(String sql) {
        this.sql = sql;

    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
