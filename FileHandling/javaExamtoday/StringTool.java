package FileHandling.javaExamtoday;

import java.util.Scanner;

public class StringTool {

    private String sentence;

    public StringTool(String sentence) {
        this.sentence = sentence;
    }

    class Analyzer {

        public int countVowels() {
            int count = 0;
            String vowels = "aeiouAEIOU";
            for (int i = 0; i < sentence.length(); i++) {
                if (vowels.indexOf(sentence.charAt(i)) != -1) {
                    count++;
                }
            }
            return count;
        }

        public int countWords() {
            if (sentence.trim().isEmpty()) return 0;
            String[] words = sentence.trim().split("\\s+");
            return words.length;
        }

        public String reverse() {
            StringBuilder sb = new StringBuilder(sentence);
            return sb.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        StringTool tool = new StringTool(input);
        StringTool.Analyzer analyzer = tool.new Analyzer();

        System.out.println("Vowel Count: " + analyzer.countVowels());
        System.out.println("Word Count: " + analyzer.countWords());
        System.out.println("Reversed String: " + analyzer.reverse());

        sc.close();
    }
}