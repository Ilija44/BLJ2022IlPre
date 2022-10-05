cmake_minimum_required(VERSION 3.23)
project(ToDoDefinitionOfDone_main C)

set(CMAKE_C_STANDARD 11)

include_directories(ToDoDefinitionOfDone-main)

add_executable(ToDoDefinitionOfDone_main
        ToDoDefinitionOfDone-main/calculator.c
        ToDoDefinitionOfDone-main/calculator.h
        ToDoDefinitionOfDone-main/main.c)
