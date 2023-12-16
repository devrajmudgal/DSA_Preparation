#include<bits/stdc++.h>
using namespace std;

class Student{
    int age;
    public:
        string name;
        int rollNo;
        
        void setAge(int a){
            age = a;
        }

        int getAge(){
            return age;
        }
        
        void display(){
            cout<<"Name: "<<name<<endl;
            cout<<"RollNo: "<<rollNo<<endl;
            cout<<"Age: "<<age<<endl;
        }
};

int main(){
    Student s1;
    s1.name="Devraj";
    s1.setAge(23);
    s1.display();

    // cout<<s1.age; --> gives error

    cout<<s1.getAge(); // --> correct

}