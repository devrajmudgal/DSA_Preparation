#include<iostream>
using namespace std;

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
};

int main(){
    Student s1(23,3421123);
    s1.display();
}