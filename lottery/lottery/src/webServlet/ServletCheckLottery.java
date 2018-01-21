package webServlet;

import javaPart.client.WorkA;
import javaPart.client.WorkB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ypy
 * @date 2018/1/20 16:21
 */
@WebServlet(name = "ServletCheckLottery")
public class ServletCheckLottery extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //假如抽奖标签名字交lottery , 获取抽奖标签的值,判断抽奖类型
        String lottery = request.getParameter("lottery");
        String getPerson;
        if ("不去重抽奖".equals(lottery)){
            getPerson = WorkA.lottery1();
        }else if ("去重抽奖".equals(lottery)){
            getPerson = WorkB.lottery2();
        }else {
            getPerson = "出错啦";
        }
        //将getperson赋值之后，利用=将相应标签的值取出然后传到前台。可以抽成一个方法做。
    }
}
