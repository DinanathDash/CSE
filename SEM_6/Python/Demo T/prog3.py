import key
import tweepy
bt = key.bearer_token
client = tweepy.Client(bearer_token=bt)
query = "ipl lang:en"
tweets = client.search_recent_tweets(query=query, max_results=10)
if tweets.data:
    for tweet in tweets.data:
        print(tweet)
        print('#' * 20)
else:
    print("No tweets found")