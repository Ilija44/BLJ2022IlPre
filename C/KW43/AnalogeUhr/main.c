#include <stdio.h>

#define FIELD_SIZE 11

int userInput;
int middle = (FIELD_SIZE - 1) / 2;

int main() {
    int field[FIELD_SIZE][FIELD_SIZE] = {0};

    printf("+--------------------------------+\n");
    printf("| Welcome to my analog clock     |\n");
    printf("+--------------------------------+\n\n");


    printf("Enter the minutes:");
    scanf("%d", &userInput);



if(userInput>=5 && userInput<=10) {


    for (int i = 0; i < 6; i++) {
        field[middle - i][middle + i] = 1;   //zeigt in rechten oberen ecken
    }
}else {


    for (int i = 0; i < 6; i++) {
        field[middle][middle + i] = 1;       //zeigt nach viertel ab
    }
}
    for (int i = 0; i < 6; i++) {            //zeigt in rechte untere ecke
        field[middle + i][middle + i] = 1;
    }


    for (int i = 0; i < 6; i++) {            // zeigt nach halb
        field[i + middle][middle] = 1;
    }

    for (int i = 0; i < 6; i++) {            //zeigt in den linkeren unteren ecken
        field[middle + i][middle - i] = 1;
    }

    for (int i = 0; i < 6; i++) {            // zeigt nach viertel vor
        field[middle][i] = 1;
    }


    for (int i = 0; i < 6; i++) {            //zeigt in linken oberen ecken
        field[i][i] = 1;
    }

    if(userInput<=5 && userInput)
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