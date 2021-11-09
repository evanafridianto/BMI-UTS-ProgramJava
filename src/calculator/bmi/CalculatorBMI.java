/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.bmi;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class CalculatorBMI {

    /**
     * @param args the command line arguments
     */
//    BMI Logic
//    bmi = (weight/(height*height));
//    bmi : <18.5 = kurang
//    bmi : <=24.9 = normal
//    bmi : <=29.9 = lebih
//    bmi : >=30.0   = obesitas
      
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan berat badan (kg) : ");
        double weight = sc.nextDouble();
        System.out.print("Masukkan tinggi badan (m) : ");
        double height = sc.nextDouble();
        double bmi = (weight/(height*height));
        
        System.out.println("Body Mass Index (BMI) anda adalah = "+(bmi)+"kg/m2");
        if(bmi<18.5){
           System.out.print("Berat badan anda kurang");
        }else if(bmi<=24.9){
           System.out.print("Berat badan anda normal/ideal");
        }else if(bmi<=29.9){
         System.out.print("Berat badan anda lebih");
        }else{
         System.out.print("Segera sadar! anda obesitas");

        }
    }
    
}
