#include<iostream>
using namespace std;

class Student{
    private:
        int age;
    public:
        string name;
        int rollNo;
        
        //default Constructor
        Student(){
            cout<<"Constructor Called!"<<endl;
        }
};

int main(){
    //creating object
    Student s1;
}