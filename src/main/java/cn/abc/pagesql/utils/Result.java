package cn.abc.pagesql.utils;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 封装返回结果
 */
public class Result implements Serializable {
    //执行结果，1为select 2为insert，update，delete

    private Integer flag;

    //返回select数据

    private List<Map<String, Object>> maps;

    //返回insert，update，delete

    private Integer find;

    private String message;

    public Result() {
    }

    public Result(Integer flag, List<Map<String, Object>> maps, Integer find, String message) {
        this.flag = flag;
        this.maps = maps;
        this.find = find;
        this.message = message;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public List<Map<String, Object>> getMaps() {
        return maps;
    }

    public void setMaps(List<Map<String, Object>> maps) {
        this.maps = maps;
    }

    public Integer getFind() {
        return find;
    }

    public void setFind(Integer find) {
        this.find = find;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}