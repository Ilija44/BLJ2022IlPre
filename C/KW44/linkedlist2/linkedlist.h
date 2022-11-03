

#ifndef MAIN_C_LINKEDLIST_H
#define MAIN_C_LINKEDLIST_H
typedef struct Node{
    int data;
    struct Node *next;
} TNode;

int *StartNodes();

void printList(TNode *head);
void addNode(int data, struct Node *head);

#endif MAIN_C_LINKEDLIST_H
