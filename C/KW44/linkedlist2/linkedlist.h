
#ifndef MAIN_C_LINKEDLIST_H
#define MAIN_C_LINKEDLIST_H
typedef struct node {
    int data;
    struct node *next;
} TNode;

void printList(TNode *head);

void addNode(int data, struct node *head);
void appendNode(int data, struct node **head);
void delete (int pos);

#endif MAIN_C_LINKEDLIST_H
