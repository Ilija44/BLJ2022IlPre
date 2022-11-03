#include <stdio.h>
#include <stdlib.h>
#include "linkedlist.h"


int main() {
    TNode *head = NULL;
    head = (TNode *) malloc(sizeof(TNode));


    printList(head);

    addNode(11, head);


    return (0);
}
