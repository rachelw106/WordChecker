import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);
        WordChecker x = new WordChecker (words);
        System.out.println(x.isWordChain());
        
        ArrayList<String> word = new ArrayList<String>();
        word.add("to");
        word.add("too");
        word.add("stool");
        word.add("tools");
        WordChecker y = new WordChecker (word);
        System.out.println(y.isWordChain());

        ArrayList<String> list = new ArrayList<String>();
        list.add("catch");
        list.add("bobcat");
        list.add("catchacat");
        list.add("cat");
        list.add("at");
        WordChecker z = new WordChecker(list);
        System.out.println(z.createList("cat"));
        System.out.println(z.createList("catch"));
        System.out.println(z.createList("dog"));
    }
}