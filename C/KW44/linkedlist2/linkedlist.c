#include <stdlib.h>
#include <stdio.h>

typedef struct Node{
    int data;
    struct Node *next;
} TNode;
struct Node *head, *tail = NULL;

int *StartNodes() {

    struct Node *head = NULL;
    struct Node *second = NULL;
    struct Node *third = NULL;

    head = (struct Node *) malloc(sizeof(struct Node));
    second = (struct Node *) malloc(sizeof(struct Node));
    third = (struct Node *) malloc(sizeof(struct Node));

    head->data = 1;
    head->next = second;

    second->data = 2;
    second->next = third;

    third->data = 3;
    third->next = NULL;

    return (int *) head;
}

void printList(struct Node *n) {
    while (n != NULL) {
        printf(" %d ", n->data);
        n = n->next;
    }
}


 void addnode(int data, struct Node *head){
struct Node *newNode = (struct Node*)malloc(sizeof(struct Node));
newNode->data = data;
newNode->next = NULL;

if(head == NULL){
    head = newNode;
    tail = newNode;
}
else{
    while(head->next != NULL)
    {
        head = head->next;
    }
    head->next = newNode;
}
}