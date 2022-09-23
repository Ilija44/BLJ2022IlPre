// Online C compiler to run C program online
#include <stdio.h>

int main() {
   int guessedNum;
   srand(time(NULL));
    int ranNum = rand() % 100;
    
    
    printf("🆆🅸🅻🅻🅺🅾🅼🅼🅴🅽 🆉🆄🅼 🆉🅰🅷🅻🅴🅽 🅴🆁🆁🅰🆃🅴🅽 🆂🅿🅸🅴🅻\n");
    printf("Geben sie eine Zahl an:");
    scanf("%d", &guessedNum);
    while(1){
        if (guessedNum > ranNum){
        
            printf("Die Zahl ist zu hoch geben sie eine tiefere an:");
            scanf ("%d", &guessedNum);
        }
        
        if (guessedNum < ranNum){
            printf("Die Zahl ist zu tief geben sie eine höhere an:");
            scanf ("%d" , &guessedNum);
    }
        if (guessedNum == ranNum){
          
            printf("Sie haben die richtige Zahl erraten");
            break;
          }
    }


    return 0;
}