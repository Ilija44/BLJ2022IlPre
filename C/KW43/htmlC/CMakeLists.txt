cmake_minimum_required(VERSION 3.23)
project(htmlC C)

set(CMAKE_C_STANDARD 99)

add_executable(htmlC main.c console.c externalfile.c header.h)
