import random
class Card:
    def __init__(self, suit, rank):
        self.suit = suit
        self.rank = rank
    def __str__(self):
        return f"{self.rank} of {self.suit}"
class Deck:
    def __init__(self):
        suits = ["Hearts", "Diamonds", "Clubs", "Spades"]
        ranks = ["2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"]
        self.cards = [Card(suit, rank) for suit in suits for rank in ranks]
    def shuffle(self):
        random.shuffle(self.cards)
    def deal(self, num_players, cards_per_player):
        if num_players * cards_per_player > len(self.cards):
            raise ValueError("Not enough cards to deal")
        return [[self.cards.pop() for _ in range(cards_per_player)] for _ in range(num_players)]
class Player:
    def __init__(self, name, hand):
        self.name = name
        self.hand = hand
    def show_hand(self):
        return ", ".join(str(card) for card in self.hand)
deck = Deck()
deck.shuffle()
num_players = 4
cards_per_player = 5
hands = deck.deal(num_players, cards_per_player)
players = [Player(f"Player {i+1}", hands[i]) for i in range(num_players)]
for player in players:
    print(f"{player.name}'s hand: {player.show_hand()}")
