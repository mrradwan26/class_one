package JavaLearning;

public class MyString3 {
    public static void main(String[] args) {
        String sentence=("I live in Dhaka");
        String word="Dhaka";
        char c=sentence.charAt(sentence.length()-1);
        System.out.println(c);
        int index=sentence.indexOf("Dhaka");
        System.out.println(index);
        boolean status=sentence.contains(word);
        System.out.println(status);
        String newSentence=sentence.replace("Dhaka","Cumilla");
        System.out.println(newSentence);
        boolean stat=sentence.startsWith("I");
        System.out.println(stat);
        boolean state=sentence.endsWith("Dhaka");
        System.out.println(state);
        String arr[]= sentence.split(" ");
        System.out.println(arr.length);
        System.out.println(sentence.substring(sentence.indexOf("Dhaka")));
    }
}
