// Implement copy constructor, overload subscript operator and + operator for an array class.
#include<iostream>
using namespace std;

class Array
{
    private:
      int *p;
      int s;
      
    public:
    Array(int size){
        s = size;
        p = new int[s];
    }
    
    Array(const Array& x)
    {
        
        s = x.s;
        
        p = new int[s];
        
        for (int i = 0; i < s; i++) {
            p[i] = x.p[i];
        }
    }
    
    int& operator[](int index)
	{
	 return p[index];
	}
    
    Array operator+(const Array& t)
    {
        Array c(s+t.s);
        
          for (int i = 0; i < s; ++i) {
           c.p[i]=p[i];
        }
        
        // Copy elements from the second array
        for (int i = 0; i < t.s; ++i) {
            c.p[s + i] = t.p[i];
        }

        return c;
    }
    
    void print() const {
        for (int i = 0; i < s; ++i) {
            cout << p[i] << ' ';
        }
        cout << endl;
    }
    
    ~Array()
    {
        cout<<"\n dtor called"<<endl;
        delete[]p;
    }
};

int main()
{
    Array a(2);
    a[0] = 10;
    a[1] = 20;
    
    cout<<"\n"<< a[0];
	cout<<"\n"<< a[1];
	cout<<endl;
    Array b(a);
    
    Array c= a + b;
    c.print();
    
    return 0;
}