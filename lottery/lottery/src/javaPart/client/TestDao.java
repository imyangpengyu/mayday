package javaPart.client;

import javaPart.Dao.QueryLotterUserNums;
import javaPart.Dao.QueryLotteryUser;
import javaPart.bean.LotteryUser;

/**
 * @author ypy
 * @date 2018/1/20 14:10
 */
public class TestDao {
    public static void main(String[] args) {
        QueryLotteryUser queryLotteryUser = new QueryLotteryUser();
        LotteryUser user = queryLotteryUser.findUser(1);
        QueryLotterUserNums queryLotterUserNums = new QueryLotterUserNums();
        Integer integer = queryLotterUserNums.countUsernum();
        System.out.println(integer);
    }
}
