package tipedata;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int uang, inputUser;
        uang= 100000;
        System.out.println("Selamat datang di Bank Unan!");
        System.out.println("Saldo saat ini Rp. " + uang);
        
        System.out.print("Silahkan simpan uang anda: Rp. ");
        inputUser = input.nextInt();
        uang += inputUser;
        System.out.println("Saldo saat ini : " + uang);
             
        System.out.print("Silahkan ambil uang anda: Rp. ");
        inputUser = input.nextInt();
        uang -= inputUser;
        
        if(uang < 0){
            System.out.println("Maaf saldo anda tidak mencukupi");    
        } else {
            System.out.println("Sisa saldo anda adalah: Rp. " + uang); 
        }
    }
}
