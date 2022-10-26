#include <stdio.h>

void console(
        int columns,
        int rows,
        int structure
) {

    if (structure == 1) {
        printf("<!DOCTYPE html>\n"
               "<html>\n"
               "   <head>\n"
               "     <meta charset=utf-8>\n"
               "    </head>\n"
               "    <body>\n"
               " <table border>\n"
               "\n");

        for (int i = 0; i != rows; ++i) {
            printf("<tr>\n");
            for (int k = 0; k != columns; ++k) {
                printf("<td> </td>\n");
            }
            printf("</tr>\n");
        }

        printf("    </table>\n");
        printf("  </body>\n");
        printf("</html>\n");
    } else {
        printf("<table>\n");
        for (int i = 0; i != rows; ++i) {
            printf("<tr>\n");
            for (int k = 0; k != columns; ++k) {
                printf("<td> </td>\n");
            }
            printf("</tr>\n");
        }
        printf("</table>\n");
    }
}