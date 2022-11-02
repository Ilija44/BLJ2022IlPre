#include <stdlib.h>
#include <stdio.h>

typedef struct Node {
    int data;
    struct Node* next;
} TNode;

int *StartNodes() {

    struct Node *head = NULL;
    struct Node *second = NULL;
    struct Node *third = NULL;

    head = (struct Node *) malloc(sizeof(struct Node));
    second = (struct node *) malloc(sizeof(struct Node));
    third = (struct node *) malloc(sizeof(struct Node));

    head->data = 1;
    head->next = second;

    second->data = 2;
    second->next = third;

    third->data = 4;
    third->next = NULL;

    return head;
}

    void printList(struct Node* head)
    {
        while (head != 0) {
            printf(" %d ", head->data);
            head = head->next;
        }
    }
