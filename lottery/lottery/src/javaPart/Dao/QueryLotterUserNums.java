package javaPart.Dao;

import javaPart.bean.LotteryUser;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ypy
 * @date 2018/1/20 15:01
 */
public class QueryLotterUserNums extends AbstractDao {

    public Integer countUsernum () {
        String sql = "select count(*) from cj_user";
        Object[] params = new Object[] {};
        Object num = super.find(sql, params);
        int count = Integer.parseInt(String.valueOf(num));
        System.out.println();
        return count;
    }
    @Override
    protected Object rowMapper(ResultSet rs) throws SQLException {
        Integer anInt = rs.getInt(1);
        return anInt;
    }
}
