#include "Address.h"
#include <iostream>
#include <cstring>

// Default constructor
Address::Address() {
    strcpy(street, "");
    strcpy(city, "");
    strcpy(state, "");
    strcpy(zipCode, "");
}

// Parameterized constructor
Address::Address(const char* street, const char* city, const char* state, const char* zipCode) {
    strcpy(this->street, street);
    strcpy(this->city, city);
    strcpy(this->state, state);
    strcpy(this->zipCode, zipCode);
}

// Setters
void Address::setStreet(const char* street) {
    strcpy(this->street, street);
}

void Address::setCity(const char* city) {
    strcpy(this->city, city);
}

void Address::setState(const char* state) {
    strcpy(this->state, state);
}

void Address::setZipCode(const char* zipCode) {
    strcpy(this->zipCode, zipCode);
}

// Getters
const char* Address::getStreet() const {
    return street;
}

const char* Address::getCity() const {
    return city;
}

const char* Address::getState() const {
    return state;
}

const char* Address::getZipCode() const {
    return zipCode;
}

// Friend functions for input and output
void inputAddress(Address& address) {
    char buffer[100];
    
    std::cout << "Enter street: ";
    std::cin.getline(buffer, 100);
    address.setStreet(buffer);

    std::cout << "Enter city: ";
    std::cin.getline(buffer, 50);
    address.setCity(buffer);

    std::cout << "Enter state: ";
    std::cin.getline(buffer, 50);
    address.setState(buffer);

    std::cout << "Enter zip code: ";
    std::cin.getline(buffer, 20);
    address.setZipCode(buffer);
}

void outputAddress(const Address& address) {
    std::cout << "Street: " << address.getStreet() << "\n"
              << "City: " << address.getCity() << "\n"
              << "State: " << address.getState() << "\n"
              << "Zip Code: " << address.getZipCode() << "\n";
}

