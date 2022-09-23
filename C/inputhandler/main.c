//
// Created by ilija on 23.09.2022.
//
*/

#include <stdio.h>
#include "inputhandler.h"
#include <stdlib.h>

int main(int argc, char** argv) {

    int a = readRangedInt(0, 10);
    printf("%d", a);
    int b = readRangedInt(-3, 12);
    printf("%d", b);
    char x = readLetter();
    printf ("%c" ,  \n);

    return (EXIT_SUCCESS);
}


