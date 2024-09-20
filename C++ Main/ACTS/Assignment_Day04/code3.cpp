#include<iostream>
#include<string>
using namespace std;

struct Student
{
        int rollno;
        string name;
};

int main()
{
        int n;
        cin>>n;

      Student s[n];

      for(int i=0;i<n;i++)
      {
              cout<<"enter roll no: "<<endl;
              cin>>s[i].rollno;
              cout<<"enter name: "<<endl;
              cin>>s[i].name;
      }
      for(int j=0;j<n;j++)
      {
              cout<<"rollNo: "<<s[j].rollno<<" name: "<<s[j].name<<endl;
      }



  return 0;
}

