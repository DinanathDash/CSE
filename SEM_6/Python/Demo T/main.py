import key
import requests
bt = key.bearer_token
def get_user_info(username):
    url = f"https://api.twitter.com/2/users/by/username/{username}?user.fields=description,id,name,username,public_metrics"
    headers = {"Authorization": f"Bearer {bt}"}
    response = requests.get(url, headers=headers)
    if response.status_code == 200:
        user = response.json()['data']
        print(f"User ID: {user['id']}")
        print(f"Username: {user['username']}")
        print(f"Name: {user['name']}")
        print(f"Followers: {user['public_metrics']['followers_count']}")
    else:
        print(f"Error: {response.status_code}")
print(get_user_info("Elon Musk"))