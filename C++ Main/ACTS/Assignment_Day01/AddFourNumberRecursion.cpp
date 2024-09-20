#include<iostream>
using namespace std;
int total(int number){
if(number==0){
return 0;
}
return number %10 + total(number/10);
}

int main(){
int number;
cout<<"enter the four digit number"<<endl;
cin>>number;
int result = total(number);
cout<<" Sum of four digits: "<<result<<endl;
} 
