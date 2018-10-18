//
// Created by Morgan Freeman on 2018/9/19.
//

#include <iostream>
using namespace std;

// var
extern int a, b;
extern int c;
extern float f;

int in_out()
{
    cout << "Hello World";

    char name[50];
    cout << "fxck name:";
    cin >> name;
    cout << name << " - yours" << endl;
}

int demo_var()
{
    int a, b;
    int c;
    float f;

    a = 10;
    b = 20;
    c = a + b;

    cout << c << endl;

    f = 70.0 / 3.0;
    cout << f << endl;

    return 0;
}

int demo_char()
{
    char str1[11] = "Hello";
    char str2[11] = "world";
    char str3[11];
    int len;

    strcpy(str3, str1);
    cout << "strcpy(str3, str1):" << str3 << endl;

    strcat(str1, str2);
    cout << "strcat(str1, str2):" << str1 << endl;

    len = strlen(str1);
    cout << "strlen(str1):" << len << endl;

    return 0;
}

int demo_str()
{
    string str1 = "hello";
    string str2 = "world";
    string str3;
    int len;

    str3 = str1 + str2;
    cout << str3 << endl;

    len = str3.size();
    cout << len << endl;

    return 0;
}

int demo_pointer()
{
    int var1;
    int var2[10];
    int *ip;

    cout << &var1 << endl;
    cout << &var2 << endl;

    ip = &var1;
    cout << ip << endl;
}

int demo_refer()
{
    int i;
    int& r = i;

    i = 5;
    cout << i << "|" << r << endl;
    r += 1;
    cout << i << "|" << r << endl;
}

int demo_time()
{
    time_t now = time(0);
    char* dt = ctime(&now);
    cout << dt << endl;

    tm *gmtm = gmtime(&now);
    dt = asctime(gmtm);
    cout << dt << endl;
}

// struct
struct Books
{
    char title[50];
    char author[50];
    char subject[50];
    int book_id;
};

int demo_struct()
{
    Books book1;

    strcpy(book1.title, "name");
    strcpy(book1.author, "wo");
    strcpy(book1.subject, "fxck");
    book1.book_id = 12345;

    cout << book1.author << endl;
}

int xmain()
{

//    in_out();
//    demo_var();
//    demo_char();
//    demo_str();
//    demo_pointer();
//    demo_refer();
//    demo_time();
    demo_struct();

    return 0;
}

