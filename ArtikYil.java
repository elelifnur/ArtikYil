import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        if((yil % 4 == 0) && (yil % 100 != 00)){
            System.out.println(yil+" bir artık yıldır !");
        } else if (yil % 100 == 0) {
            if (yil % 400 == 0){
                System.out.println(yil+" bir artık yıldır !");
            }else{
                System.out.println(yil+" bir artık yıldır değildir !");
            }
        }else{
            System.out.println(yil+" bir artık yıldır değildir !");
        }


    }
}
