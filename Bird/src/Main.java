import java.util.Scanner;

public class Main {

    public static void car(int a,int n,int d){
        switch (a) {
            case 1:
                play(new Coach(60, 200),n,d);
                break;
            case 2:
                play(new Trucks(72, 180),n,d);
                break;
                default:break;
        }
    }
    public static void play(Car c,int n,int d){
        c.show();
        System.out.println("租车数量："+n);
        System.out.println("租车天数："+d);
        System.out.println("总金额："+c.money(n,d));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Coach 2辆 日租200元");
        System.out.println("Trucks 3辆 日租180元");
        do {
            System.out.println("请选择车辆类型(1.Coach ；2.Trucks)：");
            int a=sc.nextInt();
            System.out.println("请输入租车数量：");
            int n=sc.nextInt();
            System.out.println("请输入租车天数：");
            int d=sc.nextInt();
            car(a,n,d);
            System.out.println("是否继续（Y/N）：");
        }while (sc.next().equals("Y"));
        System.out.println("再见！");
    }
}
