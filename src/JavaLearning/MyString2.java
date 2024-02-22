package JavaLearning;

public class MyString2 {
    public static void main(String[] args) {
        String sentence=("I live in Dhaka");
        char c=sentence.charAt(sentence.length()-1);
        System.out.println(c);
        int index=sentence.indexOf("Dhaka");
        System.out.println(index);
    }
}
