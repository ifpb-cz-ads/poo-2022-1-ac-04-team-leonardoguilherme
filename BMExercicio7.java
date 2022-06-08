import java.util.Scanner;

public class BMExercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um valor para x: ");
        int x = ler.nextInt();
        int y = 0;
        while(y != 1){

            if(y == 0){
                if(x % 2 == 0){
                    y = x / 2;
                } else{
                    y = (3 * x) + 1;
                }
                x = y;
            } else{
                if(x % 2 == 0){
                    y /= 2;
                } else{
                    y *= 3;
                    y += 1;
                }
                x = y;
            }

            if(y != 1){
                System.out.print(y + " -> ");
            } else{
                System.out.print(y);
            }
        }
    }
}
