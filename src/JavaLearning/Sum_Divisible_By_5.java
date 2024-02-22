package JavaLearning;

public class Sum_Divisible_By_5 {
    public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
        if (i % 5 == 0) {
            sum += i;
        }
    }
    System.out.println("Sum of numbers divisible by 5 from 1 to 100: " + sum);
}
}
//public static void main(String[] args) {
//    int sum = 0;
//    int number = 1;
//
//    while (number <= 100) {
//
//        if (number % 5 == 0) {
//            sum += number;
//            number++;
//        }
//        System.out.println("Sum of numbers divisible by 5 from 1 to 100: " + sum);
//    }
//}