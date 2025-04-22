import re
def is_valid_url(url):
    url_pattern = re.compile(
        r'^(https?:\/\/)?'
        r'([a-zA-Z0-9-]+\.)+[a-zA-Z]{2,}'
        r'(:\d+)?'
        r'(\/[^\s]*)?$',
        re.IGNORECASE
    )
    return bool(url_pattern.match(url))
test_urls = [
    "https://www.example.com",
    "http://example",
    "www.example.com",
    "example.com",
    "https://example.com/path/to/resource",
    "not-a-url"
]
for url in test_urls:
    print(f"'{url}' is a valid URL: {is_valid_url(url)}")