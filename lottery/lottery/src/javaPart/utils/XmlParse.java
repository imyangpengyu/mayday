package javaPart.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

/**
 * @author ypy
 * @date 2018/1/12 12:25
 */
public class XmlParse {
    /**
     * XML 转转为 JavaBean
     * @param xml
     * @param t
     * @param <T>
     * @return
     * @throws JAXBException
     */
    public static <T> T xmlToBean(String xml, T t) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(t.getClass());
        Unmarshaller um = context.createUnmarshaller();
        StringReader sr = new StringReader(xml);
        t = (T) um.unmarshal(sr);
        return t;
    }

    /**
     * JavaBean 转换为 XML
     * @param t
     * @param <T>
     * @return
     * @throws JAXBException
     * @throws FileNotFoundException
     */
    public static <T> StringWriter beanToXml(T t) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(t.getClass());
        Marshaller m = context.createMarshaller();
        StringWriter sw = new StringWriter();
        m.marshal(t,sw);
        //格式化Marshaller
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        //m.marshal(t,new FileOutputStream("src/javaPart/utils/T.xml"));
        //m.marshal(t,System.out);
        return sw;
    }
    public static <T> T xmlFileToBean(File f, T t) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(t.getClass());
        Unmarshaller um = context.createUnmarshaller();
        //StringReader sr = new StringReader(xml);
        //t = (T) um.unmarshal(sr);
        t = (T) um.unmarshal(f);
        return t;
    }

}
