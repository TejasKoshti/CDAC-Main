#include <iostream>
using namespace std;

template<class T>
void Swap(T& a, T& b) {
    T temp = a;
    a = b;
    b = temp;
}

template<class T>
T add(T a, T b) {
    return a + b;
}

template<class T>
T sub(T a, T b) {
    return a - b;
}

template<class T>
T mul(T a, T b) {
    return a * b;
}

template<class T>
T div(T a, T b) {
    if (b != 0) {
        return a / b;
    } else {
        cout << "Division by zero error!" << endl;
        return T(); // Return a default value
    }
}

int main() {
    int a = 40, b = 20;
    cout << "Before swap: " << a << " " << b << endl;

    Swap(a, b);
    cout << "After swap: " << a << " " << b << endl;

    int sum = add(a, b);
    cout << "Sum: " << sum << endl;

    int difference = sub(a, b);
    cout << "Difference: " << difference << endl;

    int product = mul(a, b);
    cout << "Product: " << product << endl;

//    int quotient = div(a, b); // Should work correctly now
  //  cout << "Quotient: " << quotient << endl;

    return 0;
}

