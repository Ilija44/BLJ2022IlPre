#include <stdlib.h>
#include <stdio.h>
#include "linkedlist.h"

struct node *head, *tail = NULL;


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
        tail = newNode;
    } else {
        while (head->next != NULL) {
            head = head->next;
        }
        head->next = newNode;
    }
}
