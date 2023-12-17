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
    Student s2(36,8578445);
    //copy assignment operator
    s2 = s1;
    s1.display();
    s2.display();
}