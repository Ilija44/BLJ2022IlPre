#include <stdio.h>
#include "header.h"

int main() {
    int columns = 0;
    int rows = 0;
    int structure = 0;

    printf("Hello and welcome to my table generator!\n");
    printf("How many columns do you want:\n");
    scanf("%d", &columns);
    printf("How many lines do you want:\n");
    scanf("%d", &rows);
    printf("Do you want the table in HTML structure or only the table code|1-HTML structure|0-table code|\n");
    scanf("%d", &structure);

    console(columns, rows, structure);

    externalfile(columns, rows, structure);
    return 0;
}
