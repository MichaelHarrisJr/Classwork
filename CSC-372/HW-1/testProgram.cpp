#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
#include "rectangleType.h"
#include "boxType.h"

using namespace std;

int main()

{
//Enter your Rectangle
rectangleType rect(5,20);

//Enter your BoxType
boxType box(5,6,9);

cout<<"RectangleType"<<endl;
rect.print();
cout<<"Area: "<<rect.area()<<endl;
cout<<"Perimeter: "<<rect.perimeter()<<endl;

cout<<"BoxType"<<endl;
box.print();
cout<<"Area: "<<box.area()<<endl;
cout<<"Volume: "<<box.volume()<<endl;

system("pause");

return 0;

}
