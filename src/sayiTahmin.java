import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sayiTahmin {
    public static void main(String[] args) {
        Random rnd =new Random();
        int number= rnd.nextInt(100);

        Scanner inp=new Scanner(System.in);

        int right=0;
        int selected;
        int [] wrong=new int[5];
        boolean iswin=false;
        boolean iswrong=false;

        while (right<5){

            System.out.print("Lütfen tahmininizi giriniz : ");
            selected=inp.nextInt();

            if (selected <0||selected>100){
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz!!!");
                if (iswrong){
                    right++;
                    System.out.println("Hatalı giriş yaptınız !! Kalan hakkınız "+ (5-right));

                }else {
                    iswrong= true;
                    System.out.println("Bir daha yanlış girmenşz halinde hakkınızdan düşülecektir..");

                }
                continue;
            }

            if (selected==number){
                iswin = true;
                System.out.println("Tebrikler ! Kazandınız !! ");
                break;
            }else {
                wrong[right]=selected;
                right++;
                System.out.println("Yanlış sayı girdiniz.Lütfen tekrar deneyin...");
                if (selected<number){
                    System.out.println("İpucu : " + selected  +  " Gizli sayıdan küçüktür.");
                }else {
                    System.out.println("ipucu : " + selected  + " Gizli sayıdan büyüktür.");
                }
                System.out.println("Kalan hakkınız "+ (5 - right ));
            }
        }
        if (!iswin){
            System.out.println("Kaybettiniz !!");
            if (!iswrong){
            System.out.println("Tahmin ettiğiniz sayılar "  + Arrays.toString(wrong));
            System.out.println("Gizli sayı : " + number);
        }

    }
}}
