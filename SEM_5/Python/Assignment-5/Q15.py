import random

def play_craps():
    # Roll a pair of dice and return the sum
    return random.randint(1, 6) + random.randint(1, 6)

def simulate_craps(num_games):
    # Dictionaries to track wins and losses for each roll number
    wins = {}
    losses = {}
    
    total_wins = 0
    total_losses = 0
    total_rolls = 0

    for _ in range(num_games):
        roll_count = 0
        point = None

        while True:
            roll_count += 1
            roll = play_craps()
            
            if roll == 7 or roll == 11:  # Win on 7 or 11
                total_wins += 1
                wins[roll_count] = wins.get(roll_count, 0) + 1
                break
            elif roll == 2 or roll == 3 or roll == 12:  # Loss on 2, 3, or 12
                total_losses += 1
                losses[roll_count] = losses.get(roll_count, 0) + 1
                break
            elif point is None:  # Set the point
                point = roll
            elif roll == point:  # Win by hitting the point again
                total_wins += 1
                wins[roll_count] = wins.get(roll_count, 0) + 1
                break
            elif roll == 7:  # Lose by rolling a 7 before hitting the point
                total_losses += 1
                losses[roll_count] = losses.get(roll_count, 0) + 1
                break
        
            total_rolls += 1

    return wins, losses, total_wins, total_losses, total_rolls

def display_statistics(wins, losses, total_wins, total_losses, num_games):
    # Calculate and display the overall win and loss percentages
    win_percentage = (total_wins / num_games) * 100
    loss_percentage = (total_losses / num_games) * 100
    print(f"Percentage of wins: {win_percentage:.2f}%")
    print(f"Percentage of losses: {loss_percentage:.2f}%")

    print("\nPercentage of wins/losses based on total number of rolls:")
    print("Rolls | % Resolved on this roll | Cumulative % of games resolved")
    print("-" * 80)

    cumulative_resolved = 0
    # Find the maximum roll number that occurred
    max_roll = max(max(wins.keys(), default=0), max(losses.keys(), default=0))
    
    for roll in range(1, max_roll + 1):
        total_resolved = wins.get(roll, 0) + losses.get(roll, 0)
        cumulative_resolved += total_resolved
        percentage_resolved = (total_resolved / num_games) * 100
        cumulative_percentage = (cumulative_resolved / num_games) * 100
        print(f"{roll:<5} | {percentage_resolved:<22.2f}% | {cumulative_percentage:<30.2f}%")

# Simulate 1,000,000 games of craps
num_games = 1000000
wins, losses, total_wins, total_losses, total_rolls = simulate_craps(num_games)

# Display the statistics
display_statistics(wins, losses, total_wins, total_losses, num_games)