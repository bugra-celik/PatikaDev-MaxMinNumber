import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,b;
        int enKucuk,enBuyuk;


        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        n = scan.nextInt();
        System.out.print("1.Sayıyı giriniz:");
        b = scan.nextInt();
        enKucuk = b;
        enBuyuk = b;

        for(int i =  2;i<=n;i++){
            System.out.print(i+".Sayıyı giriniz:");
            b = scan.nextInt();
            if(b < enKucuk){
                enKucuk = b;
            }
            if(b > enBuyuk){
                enBuyuk = b;
            }


        }
        System.out.println("En büyük sayı:" +enBuyuk);
        System.out.println("En küçük sayı:" +enKucuk);


    }
}
