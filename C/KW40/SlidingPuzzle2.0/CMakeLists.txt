cmake_minimum_required(VERSION 3.23)
project(SlidingPuzzle2_0 C)

set(CMAKE_C_STANDARD 99)

add_executable(SlidingPuzzle2_0 cmake-build-debug/main.c cmake-build-debug/utils.c cmake-build-debug/utils.h)
