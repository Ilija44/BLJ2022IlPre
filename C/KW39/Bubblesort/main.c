#include <stdio.h>
#define NUM_NUMBERS 8

int main() {


    int values [] = {2,6, 3,70, 23, 9, 12, 44};

    for (int i = 0; NUM_NUMBERS > i ; i++) {


        for (int i = 0; NUM_NUMBERS > i; i++) {
            if (values[i] > values[i + 1]) {

                int temp = values[i];

                values[i] = values[i + 1];

                values[i + 1] = temp;
            }
        }
    }
    for (int i = 0; NUM_NUMBERS > i ; i++){
        printf("%d \n", values[i]);
    }



    return 0;
}
