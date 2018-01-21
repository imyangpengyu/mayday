package javaPart.server;

import javaPart.Dao.QueryLotterUserNums;
import javaPart.Dao.QueryLotteryUser;
import javaPart.bean.LotteryUser;
import javaPart.bean.User;
import javaPart.utils.MyRandom;

import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ypy
 * @date 2018/1/20 15:31
 *
 * 基于数据库实现去重抽奖
 */
public class Lottery2 extends Duty{

    private Socket socket;
    private String message;
    static List<LotteryUser> users = new ArrayList<>();

    Lottery2(Socket socket,String message){
        this.socket = socket;
        this.message = message;

    }
      static {
        QueryLotterUserNums queryLotterUserNums = new QueryLotterUserNums();
        Integer countPerson = queryLotterUserNums.countUsernum();
        for (int i=0;i<countPerson;i++){
        QueryLotteryUser queryLotteryUser = new QueryLotteryUser();
        LotteryUser user = queryLotteryUser.findUser(i);
        users.add(user);
        }
    }

    @Override
    public String call() throws Exception {
        OutputStream outputStream = socket.getOutputStream();
        String str = "未找到";
        int size = users.size();
        System.out.println(size);
        int num = MyRandom.getOneRandomNum(1, size);
        int i = 0;
        System.out.println(num);
        LotteryUser lu = users.get(num);
        users.remove(lu);
        str = lu.toString();
        outputStream.write(str.getBytes());
        socket.shutdownOutput();
        return str;
    }
}
