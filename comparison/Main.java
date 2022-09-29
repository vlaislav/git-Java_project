/* 
Напиши программу, которая считывает с клавиатуры два вещественных числа
(double) и выдает сообщение о том, равны ли эти числа с точностью до одной
миллионной.
*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String sym = ( Math.abs(b - a) < 0.000001 ) ? "числа равны" : "числа не равны" ;
        System.out.println(sym);
        scanner.close();



    }
}