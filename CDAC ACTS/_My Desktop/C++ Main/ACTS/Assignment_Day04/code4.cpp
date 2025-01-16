#include<iostream>
#include<string>
#include <bits/stdc++.h>
using namespace std;

struct Student
{
        int rollno;
        string name;
};

void StuArr(int num){
        
	Student s[num];
	for(int i=0;i<num;i++)
      {
              cout<<"Enter roll no: ";
              cin>>s[i].rollno;
	      cin.ignore();

       	      cout << "Enter name: ";
       	      getline(cin, s[i].name);
      }
      for(int j=0;j<num;j++)
      {
              cout<<"rollNo: "<<s[j].rollno<<" name: "<<s[j].name<<endl;
      }
}
int main()
{
        int n;
        cin>>n;
	StuArr(n);


  return 0;
}

