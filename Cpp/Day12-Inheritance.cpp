
// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-12-inheritance/submissions/code/4680853

class Grade :  public Student{
    private:
         int score;
    public:
        Grade(string fname, string lname, int p, int s) : Student(fname, lname, p){
            score = s;
        }
        char calculate(){
            if (score > 89)
                return 'O';
            if (score > 74)
                return 'E';
            if (score > 59)
                return 'A';
            if (score > 39)
                return 'B';
            return 'D';
        }
};
