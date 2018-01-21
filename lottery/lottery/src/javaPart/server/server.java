package javaPart.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ypy
 * @date 2018/1/15 16:19
 * Serversocket端，负责将socket传入的消息匹配到相应的业务逻辑进行实现
 */
public class server {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        LinkedList<Duty> dutys = new LinkedList<>();
        //list集合用来存放多个任务
        Socket socket;
        //存放client传来的socket请求
        String input = null;
        String kind = null;
        String message = null;
        int len = 0;
        byte[] bytes = new byte[1024];
        try {
            ServerSocket ss  = new ServerSocket(10000);
            System.out.println("服务器端已启动");
        while (true){
            socket = ss.accept();
            System.out.println("客户端已连接");
            InputStream in = socket.getInputStream();
            while ((len = in.read(bytes)) != -1){
                input = new String(bytes,0,len);
                //sbuf.append(s);
            }
            socket.shutdownInput();
            //获取client端传来的请求报文，并进行业务判断，新建不同的任务进程
            String[] split = input.split(",x_x,");
            kind = split[0];
            message = split[1];
            //client端传来的报文前面一部分是kind说明业务类型，后面一部分是message附加后面的业务信息
            //中间分割符为，x_x,  选用了一个很不常用的字符串当分割符
            switch (kind){
                case "不去重抽奖":
                    Lottery lottery = new Lottery(socket,message);
                    dutys.add(lottery);
                    break;
                case "去重抽奖":
                 //  LotteryWithoutRepeat lotteryWithoutRepeat = new LotteryWithoutRepeat(socket, message);
                 //   dutys.add(lotteryWithoutRepeat);
                //上面的代码是调用基于xml为数据库的类，下面是基于mysql数据库
                    Lottery2 lottery2 = new Lottery2(socket, message);
                    dutys.add(lottery2);
                    break;
                case "添加用户":
                    break;
                case "删除用户":
                    break;
                case "查询用户":
                    break;
                default:
                    System.out.println("未查询到业务");
                    break;
            }
            List<Future<java.lang.String>> futures = executorService.invokeAll(dutys);
        }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
