#ifndef RECT_H

#define RECT_H

class rectangleType

{

private:
	
double length;
double width;

public:

void setDimension(double,double);

double area();
double perimeter();
double getLength();
double getWidth();


void print();
rectangleType(double ,double);
rectangleType();


};

#endif RECT_H
