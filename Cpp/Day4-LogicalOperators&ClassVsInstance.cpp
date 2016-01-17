// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-4-boolean-operators-class-vs-instance/submissions/code/4670716

class Person{
public:
   int age ;
   Person(int initial_Age);
   void amIOld();
   void yearPasses();
};
Person::Person(int initial_Age){
  if (initial_Age < 0) {
    cout << "This person is not valid, setting age to 0." << endl;
    initial_Age = 0;
  }
  age = initial_Age;
}
void Person::amIOld(){
    if (age > 17)
        cout << "You are old." << endl;
    else if (age > 12)
        cout << "You are a teenager." << endl;
    else
        cout << "You are young." << endl;
}
    

void Person::yearPasses(){
    ++age;
}
