#include<iostream>

#include "boxType.h"

using namespace std;

void boxType::setDimension(double l,double w,double h)

{

rectangleType::setDimension(l,w);

height=h;

}

double boxType::getHeight()

{

return height;

}

double boxType::area()

{

return 2*(getHeight() * getWidth())

+ 2*(getHeight()*getLength())

+ 2*(getWidth() * getLength());

}

double boxType::volume()

{

return getLength()*getWidth()*getHeight();

}

void boxType::print()

{

rectangleType::print();

cout<<"Height: "<<height<<endl;

}

boxType::boxType()

{

rectangleType::setDimension(0,0);

height=0;

}

boxType::boxType(double l,double w,double h)

{

rectangleType::setDimension(l,w);

height=h;

}
