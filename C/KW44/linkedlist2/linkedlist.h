

#ifndef MAIN_C_LINKEDLIST_H
#define MAIN_C_LINKEDLIST_H
typedef struct node{
    int data;
    struct node *next;
} TNode;

int *StartNodes();

void printList(TNode *head);
void addNode(int data, struct node *head);

#endif MAIN_C_LINKEDLIST_H
