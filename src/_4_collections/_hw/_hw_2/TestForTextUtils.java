package _4_collections._hw._hw_2;

public class TestForTextUtils {
    public static void main(String[] args) {
        String text = "Winston Churchill was born at Blenheim Palace, near Woodstock in Oxfordshire. " +
                      "Winston’s father, Lord Randolph Churchill, was a politician. Winston’s mother, Lady " +
                      "Randolph Churchill of Brooklyn, New York, was a daughter of American millionaire Leonard Jerome." +
                      " As the son of a prominent politician, it was unsurprising that Churchill was soon drawn into politics himself.";


        System.out.println(new TextUtils(text).getWord());
    }
}
