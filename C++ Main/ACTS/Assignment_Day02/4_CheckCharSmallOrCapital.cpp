#include<iostream>
using namespace std;

int main(){

cout<<"enter the character:"<<endl;
char ch;
cin>>ch;

if(ch>='a' && ch<='z')
cout<<"small"<<endl;

else if(ch>='A' && ch<='Z') 
cout<<"capital"<<endl;

else{
cout<<"capital"<<endl;
}
return 0;

}
