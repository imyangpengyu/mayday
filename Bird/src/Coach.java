/**
 * @Author: LuPeng
 * @Date:2018/1/8 12:48
 */
public class Coach implements Car {
    private int bodynumber;
    private double price;

    public Coach() {
        bodynumber=50;
        price=100;
    }

    public Coach(int bodynumber) {
        this.bodynumber = bodynumber;
        price=100;
    }

    public Coach(double price) {
        bodynumber=50;
        this.price = price;
    }
    public Coach(int bodynumber,double price) {
        this.bodynumber = bodynumber;
        this.price = price;
    }
    @Override
    public void show() {
        System.out.println("车辆类型：Coach");
        System.out.println("载客人数:"+bodynumber);
        System.out.println("日租价格："+price);
    }

    @Override
    public double money(int n,int d) {
        return price*n*d;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBodynumber() {
        return bodynumber;
    }

    public void setBodynumber(int bodynumber) {
        this.bodynumber = bodynumber;
    }
}
