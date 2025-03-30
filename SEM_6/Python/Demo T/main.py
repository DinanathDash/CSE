import key
import requests
def user_user_info(username):
    url = "https://api.twitter.com/2/users/by/username/{username}?.user.fields=created_at,description,entities,id,location,name,pinned_tweet_id,profile_image_url,protected,url,username,verified,verified_type,withheld"
    headers = {"Authorization": "Bearer <token>"}
bt = key.bearer_token