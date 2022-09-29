#include <stdio.h>

/*
 * File:   main.c
 * Author: surber
 *
 * Created on 7. September 2022, 10:29
 */

#include <stdio.h>
#include <stdlib.h>

#define NUM_MARKS 5


int main(int argc, char** argv) {

    printf("-----------------------\n");
    printf("Average Mark Calculator\n");
    printf("-----------------------\n");


    /*
     * TODO - Read as many marks as defined in NUM_MARKS.
     *      - Save read marks in an array of length NUM_MARKS.
     */
    float marks [NUM_MARKS];
    float marksSum = 0;
    for( int i = 0; i < NUM_MARKS; i++){

        printf ("Enter mark %d:", i+1);
        scanf ("%f" , &marks[i]);
    }


    printf("-----------------------\n");

    for( int i = 0; i < NUM_MARKS; i++){
        marksSum += marks[i];
    }

    printf ("average: %.2f", marksSum /NUM_MARKS);

    /*
     * TODO - Calculate and store the sum of all marks.
     */

    /*
     * TODO - Calculate and print the average mark.
     */

    /*
     * TODO - Extra tasks, implement only after completing all previous TODOs.
     *      - Round the calculated average to 2 decimal places (output only).
     *      - While inputting, only allow values between 1.0 and 6.0.
     *      - For every mark, input a weight and calculate the average accordingly.
     *      - Allow for the manipulation of individual marks, using the index.
     */

    return (EXIT_SUCCESS);
}

