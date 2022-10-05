#include <stdio.h>
#include "calculator.h"


int main() {

    printf("Willkommen zum Super-Rechner!\n");
    printf("\nEine Rechnung wurde berechnet: ");
    printf("\n32 im Quadrat wurde berechnet.");
    printf(" \nDas Ergebnis lautet %d\n", calcPow(32, 2));

    printf("\nEine Rechnung wurde berechnet:");
    printf("\nDie Quadratwurzel von 225 wurde berechnet. ");
    printf("\nDie Quadratwurzel von 225 betraegt %d. \n", squareRoot(225));

    return 0;
}

