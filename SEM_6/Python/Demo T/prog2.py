import key
import tweepy
bt = key.bearer_token
username = "dinanathdash"
client = tweepy.Client(bearer_token=bt)
user = client.get_user(username=username, user_fields=["description", "id", "name", "username", "public_metrics"])
if user.data:
    print(f"User ID: {user.data.id}")
    print(f"Username: {user.data.username}")
    print(f"Name: {user.data.name}")
    print(f"Followers: {user.data.public_metrics['followers_count']}")
else:
    print("User not found")