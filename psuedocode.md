//This is a deck of cards 
//These represent the values of cards, except for Aces 

public String[] create_and_shuffle_deck {

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


https://www.youtube.com/watch?v=GeEbs9-VLp0 study that to figure out how to model deck of cards

player_hand = [];
player_total = 0;
dealer_hand = [];
dealer_total = 0;

public int method get_player_choice() {
    prompt player to choose between 'hit' or 'stay' then save into player_choice;
    return player_choice;
}

public void check_for_natural_21(player_hand, dealer_hand) {
    if player_hand total == 21 or dealer_hand total == 21 {
        call and print determine_results(player_hand, dealer_hand);
    }
    else {
        break;
    }
}

//Draws card and adds to player and dealer hand 
public void method draw_card() {
    while choice is not stay {
        call get_player_choice() and save it in player_choice;
        create random int from 0 and up to deck length and save it in variable index;
        create the variable card and set it to deck[index];
        add card into player_hand;
        remove card from deck;
        if card is an ace, call choose_ace() {
            add choose_ace(card) to player or dealer total;
        }

        elif card is jack, queen, or king {
            add 10 to player/dealer total;
        }

        else {
            
            turn card[1] into an an int and add to player/dealer total;

        }
    }
}

public void determine_value_number_cards(card) {
    turn card[1] into an int and add it to total;
}


public int choose_ace() {
    print "You drew an ace, choose 1 or 11." and save the input into player_choice;
    return player_choice
}

public method determine_results(player_hand, dealer_hand) {
    if player_hand > dealer_hand {
        return "Player Wins!";
    }

    elif player_hand == dealer_hand {
        return "Tie!";
    }

    else {
        return "Dealer wins!";
    }

}

