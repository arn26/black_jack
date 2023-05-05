public class Blackjack {
    public static void main(String[] args) {
        public String[] create_and_shuffle_deck() {

            String[] suit = ["D", "S", "C", "H"];
            String[] rank = ["A", "2", "3", "4", "5", "6", "7", "8","9", "J", "Q", "K"];
            String[] deck = new String[52];
        
            for (int i = 0; i < deck.length; i++) {
                asign a suit and rank together and add it to deck;
            }
        
            for (int i = 0; i < deck.length; i++) {
                int index = int(Math.random()*deck.length);
        
                String temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }
            return deck;
        }

        System.out.println(create_and_shuffle_deck());
        
}
}