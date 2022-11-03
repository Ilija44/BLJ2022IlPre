#include <stdio.h>
#include <stdlib.h>
#include "linkedlist.h"


int main() {
    (TNode *) malloc(sizeof(TNode));
    int *head = StartNodes();
    printList(head);
    addNode(11, head);


    return (0);
}
