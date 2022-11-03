#include <stdlib.h>
#include <stdio.h>

typedef struct node {
    int data;
    struct node *next;
} TNode;

struct node *tail = NULL;


int *StartNodes() {

    struct node *head = NULL;
    struct node *second = NULL;
    struct node *third = NULL;

    head = (struct node *) malloc(sizeof(struct node));
    second = (struct node *) malloc(sizeof(struct node));
    third = (struct node *) malloc(sizeof(struct node));

    head->data = 1;
    head->next = second;

    second->data = 2;
    second->next = third;

    third->data = 3;
    third->next = NULL;

    return (int *) head;
}

void printList(TNode *head) {
    TNode *current_node = head;
    while (current_node != NULL) {
        printf("%d\n", current_node->data);
        current_node = current_node->next;
    }
}

void addNode(int data, struct node *head) {
    struct node *newNode = (struct node *) malloc(sizeof(struct node));
    newNode->data = data;
    newNode->next = NULL;

    if (head == NULL) {
        head = newNode;
        tail = newNode;
    } else {
        while (head->next != NULL) {
            head = head->next;
        }
        head->next = newNode;
    }
}