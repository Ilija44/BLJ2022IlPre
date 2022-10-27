#include <stdio.h>
typedef struct Song {
    char title[20];
    char singer[20];
    int published;
} TSong;

void printSong(char title[20], char singer[20], int published){
    printf("********************\n");
    printf("Title: %s \n", title);
    printf("Singer: %s \n", singer);
    printf("published: %d \n", published);
    printf("********************\n");
}

int main() {

     char title[20] = "Lucid Dreams";
     char singer[20] = "Juice World";
     int published = 2017;

     printSong(title, singer, published);

     TSong song = {0};
     song.published = 2017;
     strcpy(song.title, "Lucid Dreams");
     strcpy(song.singer, "Juice World");



     TSong *p_song = &song;
     printf("Title: %s \n", (*p_song).title);


    return 0;
}
