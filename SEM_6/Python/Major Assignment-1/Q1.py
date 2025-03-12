import random
from enum import Enum

class Suit(Enum):
    HEARTS = "Hearts"
    DIAMONDS = "Diamonds"
    CLUBS = "Clubs"
    SPADES = "Spades"

class Card:
    def __init__(self, suit, rank):
        self.suit = suit
        self.rank = rank

    def __repr__(self):
        return f"Card({self.suit.value}, {self.rank})"

    def value(self):
        if self.rank in ["Jack", "Queen", "King"]:
            return 10
        elif self.rank == "Ace":
            return 11
        else:
            return int(self.rank)

class Deck:
    def __init__(self):
        ranks = ["Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"]
        self.cards = [Card(suit, rank) for suit in Suit for rank in ranks]
        self.shuffle()

    def shuffle(self):
        random.shuffle(self.cards)

    def draw(self):
        return self.cards.pop() if self.cards else None

class Player:
    def __init__(self, name):
        self.name = name
        self.hand = []

    def draw_card(self, deck):
        card = deck.draw()
        if card:
            self.hand.append(card)

    def hand_value(self):
        total = sum(card.value() for card in self.hand)
        aces = sum(1 for card in self.hand if card.rank == "Ace")
        while total > 21 and aces:
            total -= 10
            aces -= 1
        return total

    def is_busted(self):
        return self.hand_value() > 21

class Dealer(Player):
    def __init__(self):
        super().__init__("Dealer")

    def should_hit(self):
        return self.hand_value() <= 16

class BlackjackGame:
    def __init__(self, player_names):
        self.deck = Deck()
        self.players = [Player(name) for name in player_names]
        self.dealer = Dealer()
        self.start_game()

    def start_game(self):
        for _ in range(2):
            for player in self.players:
                player.draw_card(self.deck)
            self.dealer.draw_card(self.deck)

        self.play_game()

    def play_game(self):
        for player in self.players:
            print(f"\n{player.name}'s turn:")
            while True:
                print(f"Hand: {player.hand}, Total: {player.hand_value()}")
                if player.is_busted():
                    print(f"{player.name} busts!")
                    break
                action = input(f"{player.name}, do you want to hit or stand? (h/s): ").lower()
                if action == "h":
                    player.draw_card(self.deck)
                else:
                    break
        print("\nDealer's turn:")
        while self.dealer.should_hit():
            self.dealer.draw_card(self.deck)
        print(f"Dealer's Hand: {self.dealer.hand}, Total: {self.dealer.hand_value()}")
        self.determine_winners()

    def determine_winners(self):
        dealer_total = self.dealer.hand_value()
        if self.dealer.is_busted():
            print("\nDealer busts! All remaining players win!")
            return
        for player in self.players:
            player_total = player.hand_value()
            if player.is_busted():
                print(f"{player.name} loses (busted).")
            elif player_total > dealer_total:
                print(f"{player.name} wins!")
            elif player_total < dealer_total:
                print(f"{player.name} loses.")
            else:
                print(f"{player.name} ties with the dealer (Push).")

player_names = input("Enter player names separated by commas: ").split(", ")
game = BlackjackGame(player_names)