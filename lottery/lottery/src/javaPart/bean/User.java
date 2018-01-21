package javaPart.bean;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * @author ypy
 * @date 2018/1/15 17:27
 * xml相应的javaBean类
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {
    @XmlAttribute(name = "group")
    private String group;
    @XmlElement(name = "userid")
    private int id;
    @XmlElement(name = "username")
    private String username;
    @XmlElement(name ="userimage")
    private String userimage;

    public User(){}

    public User(String group, int id, String username, String userimage) {
        this.group = group;
        this.id = id;
        this.username = username;
        this.userimage = userimage;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage;
    }

    @Override
    public String toString() {
        return "group='" + group + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", userimage='" + userimage + '\'' ;
    }
}
