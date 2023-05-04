//This is a deck of cards 
//These represent the values of cards, except for Aces 
Array of ints = [2, 3, 4, 5, 6, 7, 8, 9, 10];
//These are the types of cards
Array of Strings = ['clubs', 'hearts', 'spades', 'clovers'];
//This represents face cards
Array of Strings = ['jack', 'queen', 'king'];
//This represents an ace
Array of ints  = [1, 11];

player_hand = [];
dealer_hand = [];

public int method get_player_choice(player_choice) {
    prompt player to choose between 'hit' or 'stay' then save into player_choice;
    return player_choice;
}

public void method check_for_natural_21(player_hand, dealer_hand) {
    if player_hand total == 21 || dealer_hand total == 21 {
        call and print determine_results(player_hand, dealer_hand);
    }

}

//Draws card and adds to player and dealer hand 
public void method draw_card(hand) {

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

