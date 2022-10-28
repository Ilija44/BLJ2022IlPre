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

    char title[20] = "la la la la";
    char singer[20] = "Shakira";
    int published = 2017;

    printSong(title, singer, published);

    TSong song = {0};
    song.published = 2017;
    strcpy(song.title, "la la la la");
    strcpy(song.singer, "Shakira");



    TSong *p_song = &song;
    printf("Title: %s \n", (*p_song).title);


    return 0;
}
