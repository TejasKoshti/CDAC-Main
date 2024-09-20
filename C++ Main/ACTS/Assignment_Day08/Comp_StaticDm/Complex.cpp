// Q4. Use static data member in complex class to find out how many objectare created. Write parameterized and no-arg ctor.

#include <iostream>
using namespace std;

class Complex {
    private:
        int i, j;
        static int count;
    public:
        
        Complex() : i(0), j(0) {
            count++;
        }

        Complex(int real, int imag) : i(real), j(imag) {
            count++;
        }

        static int GetCount() {
            return count;
        }

        void Display() const {
            cout << "Complex Number: " << i << " + " << j << "i" << endl;
        }
};

int Complex::count = 0;

int main() {
    Complex c1;
    Complex c2(3, 4); 
    Complex c3; 

    int n = Complex::GetCount();
    cout << "The Total Count is " << n << endl;

    return 0;
}

