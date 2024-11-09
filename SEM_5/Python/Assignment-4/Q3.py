def create_list():
    global my_list
    my_list = [int(input(f"Enter element {i+1}: ")) for i in range(int(input("Enter number of elements: ")))]
def display_list():
    print("List:", my_list)
def insert_element():
    my_list.insert(int(input("Enter position: ")), int(input("Enter element: ")))
def delete_element():
    my_list.pop(int(input("Enter position: ")))
my_list = []
while True:
    choice = input("\nMenu:\n a. Create list\n b. Display list\n c. Insert element\n d. Delete element\n e. Exit\nChoose an option: ").lower()
    if choice == 'a': create_list()
    elif choice == 'b': display_list()
    elif choice == 'c': insert_element()
    elif choice == 'd': delete_element()
    elif choice == 'e': break
    else: print("Invalid choice.")