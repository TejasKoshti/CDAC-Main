#ifndef ADDRESS_H
#define ADDRESS_H

#include <string.h>

class Address {
private:
    char street[100];
    char city[50];
    char state[50];
    char zipCode[20];

public:
    // Default constructor
    Address();

    // Parameterized constructor
    Address(const char* street, const char* city, const char* state, const char* zipCode);

    // Setters
    void setStreet(const char* street);
    void setCity(const char* city);
    void setState(const char* state);
    void setZipCode(const char* zipCode);

    // Getters
    const char* getStreet() const;
    const char* getCity() const;
    const char* getState() const;
    const char* getZipCode() const;

    // Friend functions for input and output
    friend void inputAddress(Address& address);
    friend void outputAddress(const Address& address);
};

#endif // ADDRESS_H

