import java.util.Scanner;

public class Bai2 
{
    public static void main(String[] args) 
    {
        //!Xuất Dữ Liệu:
        // System.out.println("Hello World");
        // System.out.println("Hello World 2\n");
        // System.out.println("Hello World 3");
        // System.out.print("hehehe");
        // System.out.print("hehehess\"sssss\""); 
        // System.out.println("Hello mọi ngừi");
        //! NHập Dữ liệu:
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a = ");
        a = sc.nextInt();
        System.out.print("Nhập b = ");
        b = sc.nextInt();
        System.out.print("Nhập c = ");
        c = sc.nextInt();
        System.out.println("Ba Số Bạn Vừa Nhập là: " + a +" " +b +" " +c);
        double TBC = (double)(a+b+c)/3;
        System.out.println("Trung Bình Cộng là: "+TBC);
    }    
}
