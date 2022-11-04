
#ifndef MAIN_C_LINKEDLIST_H
#define MAIN_C_LINKEDLIST_H
typedef struct node {
    int data;
    struct node *next;
} TNode;

void printList(TNode *head);

void addNode(int data, struct node *head);
void appendNode(int data, struct node **head);
void delete (int pos, TNode *temp);
void AddIndex(int pos, struct node *head);
void changeAllNodes(TNode *p_head);
void nodeCount(TNode *p_head);

#endif MAIN_C_LINKEDLIST_H
