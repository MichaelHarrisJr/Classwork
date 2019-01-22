#include <iostream>
#include <vector>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;

void print(vector<int> v)
{
   cout<<"Vector items: ";
   for(int i=0;i<v.size();i++)
   {
       cout<<v.at(i)<<" ";
   }
   cout<<endl;
}
int main()
{
   char op;
   int flag=1,num;
   vector<int> v1,v2;
   do
   {
       cout<<endl<<"Enter a: to assign"<<endl;
       cout<<"      b: to push back"<<endl;
       cout<<"      c: to pop back"<<endl;
       cout<<"      d: to insert"<<endl;
       cout<<"      e: to erase"<<endl;
       cout<<"      f: to swap"<<endl;
       cout<<"      g: to clear"<<endl;
       cout<<"      h: to print"<<endl;
       cout<<"      i: to exit: ";
       cin>>op;
       switch(op)
       {
           case('a'):
               {   //assign
                   cout<<"Enter vector number: ";
                   cin>>num;
                   cout<<"Enter item and how many times: ";
                   int item,freq;
                   cin>>item>>freq;
                   if(num==1)
                       v1.assign(freq,item);
                   else
                       v2.assign(freq,item);
                   break;  
               }
           case('b'):
               {
                   //push back
                   cout<<"Enter vector number: ";
                   cin>>num;
                   cout<<"Enter item: ";
                   int item;
                   cin>>item;
                   if(num==1)
                       {
                           v1.push_back(item);
                       }
                   else
                       {
                               v2.push_back(item);
                       }
                   break;  
               }
           case('c'):
               {
              
                   //pop back
                   cout<<"Enter vector number: ";
                   cin>>num;
                   if(num==1)
                       v1.pop_back();
                   else
                       v2.pop_back();
                   break;  
               }
           case('d'):
               {
                   //insert
                   cout<<"Enter vector number: ";
                   cin>>num;
                   cout<<"Enter item and position: ";
                   int item,pos;
                   cin>>item>>pos;
                   if(num==1)
                       {
                       v1.insert(v2.begin()+pos,item);
                       }
                   else
                       v1.insert(v2.begin()+pos,item);
                   break;  
               }
           case('e'):
               {
                   //erase
                   cout<<"Enter vector number: ";
                   cin>>num;
                   cout<<"Enter position: ";
                   int pos;
                   cin>>pos;
                   if(num==1)
                       v1.erase(v1.begin()+pos);
                   else
                       v1.erase(v1.begin()+pos);
                   break;  
               }
           case('f'):
               {
                   //swap
                   v1.swap(v2);
                   break;  
               }
           case('g'):
               {
                   //clear
                   cout<<"Enter vector number: ";
                   cin>>num;
                   if(num==1)
                       v1.clear();
                   else
                       v2.clear();
                   break;  
               }
           case('h'):
               {
                   //print
                   cout<<"Enter vector number: ";
                   cin>>num;
                   if(num==1)
                       print(v1);
                   else
                       print(v2);
                   break;
               }
           case('i'):
               {
                   flag=0;
                   break;  
               }  
           }
       }while(flag);
}


