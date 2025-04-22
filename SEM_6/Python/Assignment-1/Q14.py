import random
from dataclasses import dataclass
@dataclass
class Card:
    suit: str
    rank: str
class Deck:
    def __init__(self):
        suits = ["Hearts", "Diamonds", "Clubs", "Spades"]
        ranks = ["2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"]
        self.cards = [Card(suit, rank) for suit in suits for rank in ranks]
        random.shuffle(self.cards)
    def deal(self, num_cards):
        return [self.cards.pop() for _ in range(num_cards)] if num_cards <= len(self.cards) else None
deck = Deck()
player_hand = deck.deal(5)
print("Player's Hand:")
for card in player_hand:
    print(f"{card.rank} of {card.suit}")
print(f"Remaining cards in deck: {len(deck.cards)}")
