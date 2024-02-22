package JavaLearning;

public class Sum_Random_Number {
//    public static void main(String[] args) {
////        int min=10;
////        int max=60;
////        int randomNum1=(int)Math.random()*(max-min)+min;
////        int randomNum2=(int)Math.random()*(max-min)+min;
////        System.out.println("Num1 "+randomNum1);
////        System.out.println("Num2 "+randomNum2);
////        int sum=randomNum1+randomNum2;
////        System.out.println(sum);
////    }
//}

    public static void main(String[] args) {
        int min = 10;
        int max = 60;
        int randomNum1 = (int) (Math.random() * (max - min) + min);
        int randomNum2 = (int) (Math.random() * (max - min) + min);
        System.out.println("Num1 " + randomNum1);
        System.out.println("Num2 " + randomNum2);
        int sum = randomNum1 + randomNum2;
        System.out.println(sum);
    }
}