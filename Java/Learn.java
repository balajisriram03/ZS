import java.util.Scanner;
class WordsAndCharCounting {
    static String sentence = "";
    String tempSent = "";
    int lines = 0;
    Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        WordsAndCharCounting obj = new WordsAndCharCounting();
        obj.input();
        obj.countingWords();
        obj.countingChars();
        obj.countingLines();
        obj.toUpperCase();
        obj.toLowerCase();
        obj.toSwapCase();
        obj.reverseString();
        obj.charContains();
    }

    public void input(){
        System.out.print("Enter a Sentence : ");
        while (read.hasNextLine()){
            String temp = read.nextLine();
            sentence += temp;
            lines++;
            if (temp.equals("bye")){
                break;
            }
        }
        tempSent = sentence;
    }
    public void countingChars(){
        sentence.trim();
        System.out.println("Characters = "+sentence.length());
    }
    public void countingWords(){
        int word = 0;
        for (int i=0;i<sentence.length()-1;i++){
            if (sentence.charAt(i)==' '){
                word++;
            }
        }
        System.out.println("Words = "+(word+lines-1));
    }
    public void countingLines(){
        System.out.println("lines = " + (lines-1));
    }
    public void toUpperCase(){
        String upperCase = sentence.toUpperCase();
        System.out.println("Upper case = "+upperCase);
    }
    public void toLowerCase(){
        String lowerCase = sentence.toLowerCase();
        System.out.println("Lower case = "+lowerCase);
    }
    public void toSwapCase(){
        char c;
        String str = "";
        for (int i = 0; i < tempSent.length(); i++) {
           c = tempSent.charAt(i);
           if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
           }
           else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
           }
           str+=c;
        }
        System.out.println("Swap case = "+str);
    }
    public void reverseString() {
        String reversed="";
        for(int i=0; i<sentence.length(); i++) reversed = sentence.charAt(i) == '\n' ?  ""+reversed : sentence.charAt(i) + reversed;
        System.out.println("Reverse = "+reversed);
    }
    public void charContains(){
        System.out.println("Enter character to check in String: ");
        String character = read.nextLine();
        if(sentence.contains(character)){
            System.out.println("It Contains");
        }
        else{
            System.out.println("It does not Contains");
        }
    }
    
}

