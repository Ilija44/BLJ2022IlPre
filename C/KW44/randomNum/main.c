#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int getRandomNums(int i);

int main() {

    int answer;

    do {
        printf("How many random numbers do you want to generate: \n");
        fflush(stdin);
        scanf("%d", &answer);

        if (answer < 1 || answer > 1000) {
            printf("Enter please a number between 1-1000 \n");
        }

    } while (answer < 1 || answer > 10000);

    getRandomNums(answer);

    return 0;
}

int getRandomNums(int i) {

    srand(time(NULL));

    int *nums = malloc(i * sizeof(int));

    if (nums == NULL) {
        exit(1);
    }
    for (int n = 0; n < i; n++) {
        int RandNums = rand() % 100 + 1;
        *(nums + 1) = RandNums;
        printf("%d   ", *(nums + 1));

    }
    return nums;
}