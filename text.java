package flowerQ;
import java.util.Scanner;
class Graduate implements StudentInterface,TeacherInterface{
    String name;
    String sex;
    int age;
    double fee;
    double pay;
    public void setPay(double pay) {
        this.pay = pay * 12;
        System.out.println("年收入为：" + this.pay);
    }
    public void getPay(double pay) {
        this.pay = pay * 12;
        System.out.println("年收入为：" + this.pay);
    }
    public void setFee(double fee) {
        this.fee = fee;
        System.out.println("学费设置为：" + this.fee);
    }
    public void getFee(double fee) {
        this.fee = fee;
        System.out.println("学费为：" + this.fee);
    }

    public boolean Loan(){
        if ((this.pay - this.fee) < 2000) {
            System.out.println("你的年收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
            return true;
        }
        System.out.println("你的年收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
        return false;
    }

    public static void main(String[] args) {

        Graduate graduate = new Graduate();
        graduate.sex = "男";
        graduate.name = "杰哥";
        System.out.println("你好:" + graduate.name);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的月工资：");
        double pay = scanner.nextDouble();
        graduate.setPay(pay);
        System.out.println("请输入你的学费：");
        double fee = scanner.nextDouble();
        graduate.setFee(fee);
        boolean flag = graduate.Loan();
        if (flag) {
            System.out.println("你家房子蛮大的吗");
        }else {
            System.out.println("可以随心所以的买泡面和小泡芙");
        }
    }
}
