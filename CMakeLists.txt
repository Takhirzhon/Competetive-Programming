cmake_minimum_required(VERSION 3.23)
project(Competetive_Programming)

set(CMAKE_CXX_STANDARD 14)

include_directories("ICPC TASKS")

add_executable(Competetive_Programming
        "ICPC TASKS/square.cpp"
        "ICPC TASKS/square.h")
