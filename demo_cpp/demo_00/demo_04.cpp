//
// Created by Morgan Freeman on 2019/3/5.
//

#include <fstream>
#include <iostream>

using namespace std;

int main() {
    char data[100];

    ofstream outfile;
    outfile.open("./afile.dat");

    cout << "Your Name:" << endl;
    cin.getline(data, 100);
    outfile << data << endl;

    cout << "Your Age:" << endl;
    cin >> data;
    outfile << data << endl;

    outfile.close();

    ifstream infile;
    infile.open("./afile.dat");

    infile >> data;
    cout << data << endl;

    infile >> data;
    cout << data << endl;

    infile.close();
    return 0;
}