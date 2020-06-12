public class ServerNameGernerator {
    public static String[] adjectives = {"Awful", "Blushing","Enthusiastic","Lazy","Talented","Strange","Jittery","Successful","Modern","Mysterious"};
    public static String[] nouns = {"dog","cat","bat","frog","human","cow","horse","goat","camel","llama"};

    public static String randomElem(String[] word){
        return word[(int)Math.floor(Math.random() * (word.length-1))];
    }

    public static void main(String[] args) {
        System.out.println("Your server today is: ");
        System.out.println(randomElem(adjectives) + "-" + randomElem(nouns));
    }
}
