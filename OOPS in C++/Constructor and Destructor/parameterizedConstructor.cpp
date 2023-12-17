#include<iostream>
#include<strings.h>
using namespace std;

class Student{
    int rollNo;
    public:
        int age;
        string name;
        Student(int a,int r,string n){
            age=a;
            rollNo=r;
            name=n;
        }
        void display(){
            cout<<"Name: "<<name<<endl;
            cout<<"Age: "<<age<<endl;
            cout<<"RollNo: "<<rollNo<<endl;
        }
};

int main(){
    Student s1(20,43535345,"Devraj");
    s1.display();
    
}