#include <stdio.h>
#include <stdlib.h>


typedef struct Book {
} Tbook;

int main() {

    int *ptr;
    Tbook book = {0};

    Tbook array[150000000] = {0};

    for (int i = 0; i < 150000000; ++i) {
        array[i] = book;
        printf("0");

        int *ptr = (int *) malloc(5 * sizeof(int));

    }
    return 0;
}
