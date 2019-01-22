#ifndef BOX_H

#define BOX_H

#include<iostream>

#include "rectangleType.h"

using namespace std;

class boxType : public rectangleType

{

private:

double height;

public:

void setDimension(double,double,double);

double getHeight();
double volume();
double area();

void print();

boxType();

boxType(double ,double,double );

};

#endif BOX_H
