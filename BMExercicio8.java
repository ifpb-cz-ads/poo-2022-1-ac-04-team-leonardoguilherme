public class BMExercicio8{
    public static void main(String[] args){
        System.out.println("Os múltiplos de 3 entre 1 e 100:");
        int multiplo = 1;
        int i = 1;
        while (multiplo<=100){
            if(multiplo%3==0){
                System.out.println(multiplo);
            }
            multiplo = 3 * i;
            i++;
        };
    }
}