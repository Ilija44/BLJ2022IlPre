#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int getRandomNums(int n);

int main() {

    int answer;

    do {
        printf("How many random numbers do you want to generate: \n");
     
        scanf("%d", &answer);


        getRandomNums(answer);

        return 0;
    }

    int getRandomNums(int answer) {

        srand(time(NULL));

        int *nums = malloc(answer * sizeof(int));

        if (nums == NULL) exit(1);

        for (int n = 0; n < answer; n++) {
            printf("%d   ", rand() % 100 + 1);
        }
        return nums;
    }