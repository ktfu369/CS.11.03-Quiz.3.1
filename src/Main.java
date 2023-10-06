public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade){
        if(grade >= 90){
            return 'A';
        }
        else if(grade >= 80){
            return 'B';
        }
        else if(grade >= 70){
            return 'C';
        }
        else if(grade >= 60){
            return 'D';
        }
        else if(grade >= 50){
            return 'E';
        }
        else{
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num){
        String ans = "";
        if(num%3 == 0){
            ans += "fizz";
        }
        if(num%5 == 0){
            ans += "buzz";
        }
        if(ans.isEmpty()){
            return "unlucky";
        }
        return ans;
    }

    // Question 3 - frontBack
    public static String frontBack(String x){
        if(x.length()<2){
            return x;
        }
        String front = x.substring(0,2);
        return front + x + front;
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a,int b,int c){
        if(a + b == c){
            return true;
        }
        if(a + c == b){
            return true;
        }
        if(b + c == a){
            return true;
        }
        return false;
    }

    // Question 5 - endUp
    public static String endUp(String x){
        if(x.length()<3){
            return x.toUpperCase();
        }
        String front = x.substring(0,x.length()-3);
        String back = x.substring(x.length()-3);
        return front + back.toUpperCase();
    }
}
