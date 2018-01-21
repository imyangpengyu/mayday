package javaPart.server;

import javaPart.bean.PackageUserxml;
import javaPart.bean.User;
import javaPart.utils.XmlParse;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.util.List;

/**
 * @author ypy
 * @date 2018/1/16 18:44
 *
 * 测试从xml中读取user添加到list中
 */
public class xmlTest {
    public static void main(String[] args) throws JAXBException {
        File f = new File("src/javaPart/server/userinfo.xml");
        PackageUserxml pu = new PackageUserxml();
        pu = XmlParse.xmlFileToBean(f, pu);
        List<User> users = pu.getUsers();
        for (User u:users){
            System.out.println(u.getUsername()+"\t"+u.getGroup());
        }
    }
}
