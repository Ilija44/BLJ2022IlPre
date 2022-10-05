#include <stdio.h>
#include "calculator.h"


int calcPow(int base, int exp) {
    if (exp == 0){
        return 1;
    }

    int result = base;

    for (exp; > 1; exp--) {
        result = result * base;
    }

    return result;
}

int squareRoot(int square) {
    int count = 2;
    while (count > 1) {
        if (count * count == square) {
            break;
            count += 2;
            return count;
        }
        count++;
    }
    return count;
}
