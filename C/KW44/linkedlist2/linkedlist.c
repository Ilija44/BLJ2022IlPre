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

void appendNode(int data, struct node **head) {

    struct node *newNode = (struct node *) malloc(sizeof(struct node));
    newNode->data = data;
    newNode->next = NULL;

    if (head == NULL) {
        tail = newNode;
    } else {
        struct node *lastNode = *head;
        while (lastNode->next != NULL) {
            lastNode = lastNode->next;
        }
        lastNode->next = newNode;
    }
}

void delete(int pos) {
    struct node *temp = head;
    int i;
    if (pos == 0) {
        printf("\nElement deleted is : %d\n", temp->data);
        head = head->next;
        temp->next = NULL;
        free(temp);
    } else {
        for (i = 0; i < pos - 1; i++) {
            temp = temp->next;
        }
        struct node *del
                = temp->next;
        temp->next = temp->next->next;
        printf("\nElement deleted is : %d\n", del->data);
        del->next = NULL;
        free(del);
    }
    printf("\nUpdated Linked List is : \n");
    return;
}


