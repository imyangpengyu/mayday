package javaPart.server;

import javaPart.Dao.QueryLotterUserNums;
import javaPart.Dao.QueryLotteryUser;
import javaPart.bean.LotteryUser;
import javaPart.bean.PackageUserxml;
import javaPart.bean.User;
import javaPart.utils.MyRandom;
import javaPart.utils.XmlParse;

import java.io.File;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

/**
 * @author ypy
 * @date 2018/1/15 15:27
 * 抽奖类，抽奖业务逻辑的实现
 */
public class Lottery extends Duty{
    private Socket socket;
    private String message;

    Lottery(Socket socket,String message){
        this.socket = socket;
        this.message = message;
    }


    @Override
    public String call() throws Exception {
        OutputStream outputStream = socket.getOutputStream();
        String str = "未找到";
/*            File f = new File("src/javaPart/server/userinfo.xml");
            PackageUserxml pu = new PackageUserxml();
            pu = XmlParse.xmlFileToBean(f, pu);
            List<User> users = pu.getUsers();
            int size = users.size();
            int num = MyRandom.getOneRandomNum(1, size);
            for (User u:users){
                if (u.getId() == num){
                   str =u.toString();
                   break;
               }
            }*/
        //上面代码是基于xml作为数据库做的，下面是从数据库中拿一个随机的用户
        QueryLotterUserNums queryLotterUserNums = new QueryLotterUserNums();
        Integer countPerson = queryLotterUserNums.countUsernum();
        int num = MyRandom.getOneRandomNum(1, countPerson);
        QueryLotteryUser queryLotteryUser = new QueryLotteryUser();
        LotteryUser user = queryLotteryUser.findUser(num);
            str = user.toString();
            outputStream.write(str.getBytes());
        socket.shutdownOutput();
        return str;
    }
}
