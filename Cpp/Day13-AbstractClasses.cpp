
// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-13-abstract-classes/submissions/code/4680966

class MyBook : Book {
    
    protected:
        int price;
    public:
        MyBook(string t, string a, int p) : Book(t, a) {
            price = p;
        }
        virtual void display() override {
            cout << "Title: " << title << endl;
            cout << "Author: " << author << endl;
            cout << "Price: " << price << endl;
        }
    
};
