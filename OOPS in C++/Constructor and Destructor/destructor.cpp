#include<iostream>
using namespace std;
//Use of Copy Constructor
class Student{
    int age;
    int rollNo;
    public:
        Student(int age,int rollNo){
            cout<< "this Keyword: "<<this<<endl; //holds address of current object
            cout<<"Constructor Called!"<<endl;
            this -> age = age;
            this -> rollNo = rollNo;
        }
        void display(){
            cout<<"Age: "<<age<<endl;
            cout<<"RollNo: "<<rollNo<<endl;
        }
        //Destructor is used to deallocated memory of our object
        ~Student(){
            cout<<"Destructor called!"<<endl;
        }
};

int main(){
    Student s1(23,3421123);
    s1.display();
    Student s2(s1); //copy constructor-->here content of s1 object is copied to s2 object.
    s2.display();
}