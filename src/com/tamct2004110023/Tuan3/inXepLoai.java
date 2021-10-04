package vn.edu.Tuan3;

import java.util.Scanner;

public class inXepLoai {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int xepLoai;
        System.out.println("Nhap phan tu cua mang vao: ");
        int n = sc.nextInt();
        System.out.println("Nhap ten sinh vien vao: ");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhap diem vao: ");
        xepLoai = sc.nextInt();
        if(xepLoai >= 9)
        {
            System.out.println("Xuat Sac");
        }
        else if(xepLoai >= 8)
        {
            System.out.println("Gioi");
        }
        else if(xepLoai >= 7)
        {
            System.out.println("Kha");
        }
        else if(xepLoai >= 5)
        {
            System.out.println("Trung Binh");
        }
        else
        {
            System.out.println("Yếu");
        }
    }
}
