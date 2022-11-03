#include <stdio.h>
#include <stdlib.h>
#include "linkedlist.h"


int main() {
    TNode *head = NULL;
    head = (TNode *) malloc(sizeof(TNode));

    head->data = 5;
    head->next = (struct node *) malloc(sizeof(struct node));
    head->next = NULL;


    addNode(11, head);
    addNode(69, head);
    addNode(111, head);
    printList(head);


    return (0);
}
