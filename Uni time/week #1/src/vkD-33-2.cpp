#include <iostream>
#include <utility>
#include <vector>

struct Book {
    long ISBN;
    std::string name;
    int year;

    Book(long ISBN, std::string name, int year) : ISBN(ISBN), name(std::move(name)), year(year) {}
};

void merge(std::vector<Book> &arr) {

}

void mergeSort() {

}

int main() {
    int n;
    std::cin >> n;
    std::vector<Book> input;
    for (int i = 0; i < n; i++) {
        Book bookName(0, "", 0);
        long ISBN;
        std::string name;
        int year;
        std::cin >> ISBN >> name >> year;
        input.emplace_back(ISBN, name, year);
    }

    for (const auto &e: input) {
        std::cout << e.ISBN << " " << e.name << " " << e.year << std::endl;
    }
}