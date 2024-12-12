#include <stdio.h>
#include <stdlib.h>

// Define the structure for a node in the linked list
struct Node {
    int data;
    struct Node *next;
};

// Function prototypes
struct Node *create_node(int data);
void append_node(struct Node **head, int data);
void print_list(struct Node *head);
void sort_list(struct Node **head);

int main() {
    struct Node *head = NULL;
    int n, data;

    printf("Enter the number of nodes: ");
    scanf("%d", &n);

    // Create the linked list
    for (int i = 0; i < n; i++) {
        printf("Enter data for node %d: ", i + 1);
        scanf("%d", &data);
        append_node(&head, data);
    }

    printf("\nOriginal Linked List:\n");
    print_list(head);

    // Sort the linked list
    sort_list(&head);

    printf("\nSorted Linked List in Ascending Order:\n");
    print_list(head);

    return 0;
}

// Function to create a new node
struct Node *create_node(int data) {
    struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
    if (!new_node) {
        printf("Memory allocation failed!\n");
        exit(1);
    }
    new_node->data = data;
    new_node->next = NULL;
    return new_node;
}

// Function to append a node to the linked list
void append_node(struct Node **head, int data) {
    struct Node *new_node = create_node(data);
    if (*head == NULL) {
        *head = new_node;
    } else {
        struct Node *temp = *head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = new_node;
    }
}

// Function to print the linked list
void print_list(struct Node *head) {
    struct Node *temp = head;
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Function to sort the linked list in ascending order
void sort_list(struct Node **head) {
    if (*head == NULL || (*head)->next == NULL) {
        return; // No need to sort if the list is empty or has one node
    }
    struct Node *current, *index;
    int temp;

    for (current = *head; current != NULL; current = current->next) {
        for (index = current->next; index != NULL; index = index->next) {
            if (current->data > index->data) {
                // Swap the data of current and index
                temp = current->data;
                current->data = index->data;
                index->data = temp;
            }
        }
    }
}

/*
Enter the number of nodes: 4
Enter data for node 1: 45
Enter data for node 2: 86
Enter data for node 3: 12
Enter data for node 4: 5

Original Linked List:
45 -> 86 -> 12 -> 5 -> NULL

Sorted Linked List in Ascending Order:
5 -> 12 -> 45 -> 86 -> NULL
*/