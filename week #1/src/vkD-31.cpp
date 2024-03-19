#include <iostream>

int main()
{
    int size;
    std::cin >> size;
    int arr[size];
    for (int i = 0; i < size; i++)
    {
        std::cin >> arr[i];
    }
    int element;
    std::cin>>element;
    int count = 0;

    for (int i = 0; i < size; i++)
    {
        if (arr[i] != element)
        {
            count++;
        }
        
    }
    std::cout << count;
}