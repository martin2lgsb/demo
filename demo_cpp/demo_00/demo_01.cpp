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

int prime() {
    int n, i, m = 0, flag = 0;
    cout << "Enter the Number to check Prime: ";
    cin >> n;
    m = n/2;
    for (i = 2; i <= m; i++) {
        if (n % i == 0) {
            cout << "Number is not Prime."<< endl;
            flag = 1;
            break;
        }
    }

    if (flag == 0)
        cout << "Number is Prime."<< endl;
    return 0;
}


int main01() {
//    fibonacci_01();
//    fibonacci_02();
    prime();

}
