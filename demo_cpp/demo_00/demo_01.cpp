//
// Created by Morgan Freeman on 2018/10/18.
//

#include <iostream>

using namespace std;

int fibonacci_01() {
    int n1 = 0, n2 = 1, n3, i, number;
    cout << "Enter the number of elements: ";
    cin >> number;
    cout << n1 << " " << n2 << " ";
    for (i = 2; i < number; i++) {
        n3 = n1 + n2;
        cout << n3 << " ";
        n1 = n2;
        n2 = n3;
    }

    return 0;
}

void printFibonacci(int n) {
    static int n1 = 0, n2 =1, n3;
    if (n > 0) {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        cout << n3 << " ";
        printFibonacci(n - 1);
    }
}

int fibonacci_02() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    cout << "Fibonacci Series: ";
    cout << "0 " << "1 ";
    printFibonacci(n - 2);
    return 0;
}

int main() {
//    fibonacci_01();
//    fibonacci_02();


}
