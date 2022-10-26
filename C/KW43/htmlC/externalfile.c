#include <stdio.h>

void externalfile(
        int columns,
        int rows,
        int structure
) {
    FILE *file1;
    file1 = fopen("C://Users//ilija//BLJ2022IlPre//HTML//KW43//tables//tables.index.html", "w");
    if (structure == 1) {
        fprintf(file1, "<!DOCTYPE html>\n"
                       "<html>\n"
                       "   <head>\n"
                       "     <meta charset=utf-8>\n"
                       "    </head>\n"
                       "    <body>\n"
                       " <table>\n"
                       "\n");

        for (int i = 0; i != rows; ++i) {
            fprintf(file1, "<tr>\n");
            for (int k = 0; k != columns; ++k) {
                fprintf(file1, "<td> </td>\n");
            }
            fprintf(file1, "</tr>\n");
        }
        fprintf(file1, "    </table>\n");
        fprintf(file1, "  </body>\n");
        fprintf(file1, "</html>\n");
    } else {
        fprintf(file1, "<table>\n");
        for (int i = 0; i != rows; ++i) {
            fprintf(file1, "<tr>\n");
            for (int k = 0; k != columns; ++k) {
                fprintf(file1, "<td> </td>\n");
            }
            fprintf(file1, "</tr>\n");
        }
        fprintf(file1, "</table>\n");
    }
    fclose(file1);

}