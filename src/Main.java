import java.util.Random;

public class Main {
    public static void main(String[] args) {
       /*int a = 10;
       int b = 20;
       int sum = a + b;
        System.out.println(sum);

        System.out.println("Malika");
        System.out.println("Kanukey Djanybekova");//kjhghjk


        System.out.println("ulan");*/

        Random rand = new Random();
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(20);
        }
        for (int i = 0; i < 10; i++) {
            sum +=array[i];
        }
        System.out.println(sum/10);


}}