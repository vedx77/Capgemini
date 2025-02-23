import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h;
        float w, bmi, sub, add;
        System.out.println("Enter weight in kg");
        w = sc.nextFloat();
        System.out.println("Enter height in cm");
        h = sc.nextInt();
        bmi = w / (((float) h /100) * ((float) h /100));

        if (bmi > 25){
            System.out.printf("Your BMI is %.2f . You are overweight", bmi);
            sub = bmi - 25;
            System.out.printf("\nReduce %.2f kg to be fit", sub);
        } else if (bmi < 18.5){
            System.out.printf("Your BMI is %.2f . You are underweight", bmi);
            add = (float) 18.5 - bmi;
            System.out.printf("\nGain %.2f kg to be fit", add);
        }
        else{
            System.out.printf("Your BMI is %.2f . You are fit and healthy", bmi);
        }
    }
}