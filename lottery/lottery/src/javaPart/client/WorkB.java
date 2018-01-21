package javaPart.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ypy
 * @date 2018/1/17 9:56
 */
public class WorkB {
    //去重抽奖
    public static String lottery2() {
        String personInformation = "没有取到";
        try {
            Socket socket = new Socket("127.0.0.1", 10000);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("去重抽奖,x_x,啥也没有".getBytes());
            outputStream.flush();
            socket.shutdownOutput();
            InputStream inputStream =socket.getInputStream();
            byte[] bs = new byte[1024];
            int len = 0;
            StringBuffer stb = new StringBuffer();
            while ((len=inputStream.read(bs)) != -1) {
                String s = new String(bs, 0, len);
                stb.append(s);
            }
            personInformation = stb.toString();
            System.out.println(personInformation);
            socket.shutdownInput();
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personInformation;
    }
}
