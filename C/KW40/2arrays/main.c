#include <stdio.h>

#define FIELD_LENGTH 5


int main() {

    int userX = 0;
    int userY = 0;
    int userNum = 0;
    int deleteOpt = 0;
    int arr[FIELD_LENGTH][FIELD_LENGTH] = {{0}};

    while(1) {


        printf("\nHerzlich willkomen zu meinem Programm zu zweidimensionalen Arrays");
        printf("\n---------5---------------------------------------------------------");
        printf("\nGeben Sie die Position der Zeile in Ihrem Array ein (0-4):");
        scanf("%d", &userX);
        printf("\nGeben Sie die Position der Spalte in Ihrem Array ein (0-4):");
        scanf("%d", &userY);
        printf("\nGeben Sie die Zahl ein die Sie einsetzen wollen:");
        scanf("%d", &userNum);

        if (arr[userX][userY] == 0) {
            arr[userX][userY] = userNum;
        }

        for (int i = 0; i < FIELD_LENGTH; i++) {
            for (int j = 0; j < FIELD_LENGTH; j++) {
                printf("(%d)", arr[i][j]);
            }
            printf("\n");
        }
        printf("Willst du eine gespeicherte Zahl in der Array loeschen (1/0): ");
        scanf("%d", &deleteOpt);

        if(deleteOpt == 1){

            printf("\nGeben Sie die Position der Zeile in Ihrem Array ein:");
            scanf("%d", &userX);
            printf("\nGeben Sie die Position der Spalte in Ihrem Array ein:");
            scanf("%d", &userY);

            arr[userX][userY] = 0;
        }

    }
        return 0;

}
