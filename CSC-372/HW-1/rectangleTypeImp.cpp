#include <iostream>

#include "rectangleType.h"

using namespace std;

void rectangleType::setDimension(double l,double w)

{

length=l;

width=w;

}

double rectangleType::getLength()

{

return length;

}

double rectangleType::getWidth()

{

return width;

}

double rectangleType::area()

{

return length*width;

}

double rectangleType::perimeter()

{

return 2*(length+width);

}

void rectangleType::print()

{

cout << "Length: " << length

<<" Width: "<<width << endl;

}

rectangleType::rectangleType()

{

length=width=0;

}

rectangleType::rectangleType(double l,double w)

{

setDimension(l,w);

}
