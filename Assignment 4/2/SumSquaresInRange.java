class SumSquaresInRange {
    static int SumSquare(int x) {
        if (x == 0) // If value given 0 then Return 0
            return 0;
        else
            return (x * x) + SumSquare(x - 1); // variable square and decrease original variable and and do again 
    }


    public static void main(String[] args) {
        int argument = 4; // given value
        int result = SumSquare(argument); // value to calculator
        System.out.println(result);// print out
    }
}