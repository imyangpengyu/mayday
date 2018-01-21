package javaPart.bean;


import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author ypy
 * @date 2018/1/15 20:47
 *
 * user为了解析成xml文件格式好看而添加的包装类
 */

@XmlRootElement(name = "i2finance")
@XmlAccessorType(XmlAccessType.FIELD)
public class PackageUserxml implements Serializable{
    @XmlElement(name = "user")
    @XmlElementWrapper(name = "users")
    private List<User> users;

    public PackageUserxml(List<User> users) {
        this.users = users;
    }

    public PackageUserxml() {
    }

    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
}
