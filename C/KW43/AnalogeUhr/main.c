#include <stdio.h>

#define FIELD_SIZE 11

int userInput = 0;
int middle = (FIELD_SIZE - 1) / 2;
int rep = 1;

int main() {
    int field[FIELD_SIZE][FIELD_SIZE] = {0};

    printf("+--------------------------------+\n");
    printf("| Welcome to my analog clock     |\n");
    printf("+--------------------------------+\n\n");

    do {

        printf("Enter the minutes:");
        scanf("%d", &userInput);

        if (userInput > 60 || userInput < 0) {
            printf("invalid number\n");
            rep = 0;
        }
    } while (rep == 0);

    if (userInput >= 5 && userInput <= 10) {
        for (int i = 0; i < 6; i++) {
            field[middle - i][middle + i] = 1;   //zeigt in rechten oberen ecken
        }
    } else if (userInput >= 11 && userInput <= 18)

        for (int i = 0; i < 6; i++) {
            field[middle][middle + i] = 1;       //zeigt nach viertel ab
        }
    else if (userInput >= 19 && userInput <= 25)

        for (int i = 0; i < 6; i++) {            //zeigt in rechte untere ecke
            field[middle + i][middle + i] = 1;
        }
    else if (userInput >= 26 && userInput <= 33)


        for (int i = 0; i < 6; i++) {            // zeigt nach halb
            field[i + middle][middle] = 1;
        }
    else if (userInput >= 34 && userInput <= 39)

        for (int i = 0; i < 6; i++) {            //zeigt in den linkeren unteren ecken
            field[middle + i][middle - i] = 1;
        }
    else if (userInput >= 40 && userInput <= 47)

        for (int i = 0; i < 6; i++) {            // zeigt nach viertel vor
            field[middle][i] = 1;
        }
    else if (userInput >= 48 && userInput <= 54)


        for (int i = 0; i < 6; i++) {            //zeigt in linken oberen ecken
            field[i][i] = 1;
        }
    else if (userInput >= 55 && userInput == 60 && userInput <= 4)
        for (int i = 0; i < 6; i++) {            //zeigt nach oben
            field[i][middle] = 1;

        }

    printf("\n\t+----+----+----+----+----+----+----+----+----+----+----+\n");
    for (int row = 0; row < FIELD_SIZE; row++) {
        printf("\t| ", row + 1);
        for (int col = 0; col < FIELD_SIZE; col++) {
            if (field[row][col] != 0) {
                printf(" # | ");
            } else {
                printf("   | ");
            }
        }
        printf("\n\t+----+----+----+----+----+----+----+----+----+----+----+\n");

    }


    return 0;
}