package javaPart.server;

import javaPart.bean.PackageUserxml;
import javaPart.bean.User;
import javaPart.utils.MyRandom;
import javaPart.utils.XmlParse;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

/**
 * @author ypy
 * @date 2018/1/17 19:47
 *
 * 这个类是之前基于xml作为数据库实现的去重抽奖代码
 */
public class LotteryWithoutRepeat extends Duty {
    private Socket socket;
    private String message;
    static List<User> users;

    LotteryWithoutRepeat(Socket socket,String message){
        this.socket = socket;
        this.message = message;
    }
    static {
        File f = new File("src/javaPart/server/userinfo.xml");
        PackageUserxml pu = new PackageUserxml();
        try {
            pu = XmlParse.xmlFileToBean(f, pu);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        users = pu.getUsers();
    }


    @Override
    public String call() throws Exception {
        OutputStream outputStream = socket.getOutputStream();
        String str = "未找到";
            int size = users.size();
            System.out.println(size);
            int num = MyRandom.getOneRandomNum(1, size);
            int i = 0;
            for (User u:users){
                if (u.getId() == num){
                    str =u.toString();
                    users.remove(u);
                    break;
                }
            }
            outputStream.write(str.getBytes());
        socket.shutdownOutput();
        return str;
    }
}
