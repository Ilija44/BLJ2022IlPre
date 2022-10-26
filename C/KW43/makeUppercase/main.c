#include <stdio.h>


char makeUppercase(char *p_c);

int main() {
    char c1;
    char c2 = '!';
    printf("Please enter a letter u want to uppercase:\n");
    scanf("%c", &c1);
    makeUppercase(&c1);
    makeUppercase(&c2);
    printf("%c%c", c1, c2);


    return 0;
}

char makeUppercase(char *p_c) {
    if (96<*p_c && *p_c < 123) {
        *p_c -= 32;
    } else {
        printf("Not a valid argument\n");
    }
}




