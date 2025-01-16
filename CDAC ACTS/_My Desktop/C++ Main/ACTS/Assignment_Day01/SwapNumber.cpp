#include<iostream>
using namespace std;

int main()
{
    int a,b,c;
    cout<<"enter value of a "<<endl;
    cin>>a;

    cout<<"enter value of b "<<endl;
    cin>>b;

    c=a;
    a=b;
    b=c;

    cout<<"value of a is "<<a<<endl;

    cout<<"value of b is "<<b<<endl;

    return 0;

}
