/**
 * @Author: LuPeng
 * @Date:2018/1/8 13:31
 */
public class Trucks implements Car {
    private double weight;
    private double price;

    public Trucks() {
        weight=36;
        price=100;
    }

    public Trucks(double weight,double price) {
        this.weight = weight;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void show() {
        System.out.println("车辆类型：Truck");
        System.out.println("载货吨数:"+weight);
        System.out.println("日租价格："+price);
    }

    @Override
    public double money(int n, int d) {
        return price*n*d;
    }
}
