class Chapter:
    def __init__(self, title, pages):
        self.title = title
        self.pages = pages
class Book:
    def __init__(self, title):
        self.title = title
        self.chapters = []
    def add_chapter(self, chapter):
        self.chapters.append(chapter)

    def total_pages(self):
        return sum(chapter.pages for chapter in self.chapters)
book = Book("Python Programming")
chapter1 = Chapter("Introduction to Python", 20)
chapter2 = Chapter("Object-Oriented Programming", 35)
chapter3 = Chapter("Advanced Topics", 50)
book.add_chapter(chapter1)
book.add_chapter(chapter2)
book.add_chapter(chapter3)
print(f"Total pages in '{book.title}': {book.total_pages()}")
