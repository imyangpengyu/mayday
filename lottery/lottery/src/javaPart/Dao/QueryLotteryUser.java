package javaPart.Dao;

import javaPart.bean.LotteryUser;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ypy
 * @date 2018/1/19 12:06
 */
public class QueryLotteryUser extends AbstractDao {

    public LotteryUser findUser(int userId) {
        String sql = "select * from cj_user where Id = ?";
        Object[] params = new Object[] { userId };
        Object user = super.find(sql, params);
       // System.out.println(((LotteryUser)user).toString());
        return (LotteryUser) user;
    }
    @Override
    protected Object rowMapper(ResultSet rs) throws SQLException {
        LotteryUser user = new LotteryUser();
        user.setTeamId(rs.getInt("Teamid"));
        user.setId(rs.getInt("Id"));
        user.setPicturePatch(rs.getString("Picture"));
        user.setName(rs.getString("Name"));
        user.setState(rs.getInt("State"));
        user.setData((String.valueOf( rs.getDate("Date"))));
        return user;
    }

}
