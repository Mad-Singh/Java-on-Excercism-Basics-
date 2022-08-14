class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int num = 0;
        for(int i=1; i<=input; i++){
            num = num + i;
        }
        return num * num;
    }

    int computeSumOfSquaresTo(int input) {
        int num = 0;
        int temp = 0;
        for(int i=1; i<=input; i++){
            num = i * i;
            temp = temp + num;
        }
        return temp;
    }

    int computeDifferenceOfSquares(int input) {
        int num = 0;
        int temp = 0;
        for(int i=1; i<=input; i++){
            num = i * i;
            temp = temp + num;
        }
        int num1 = 0;
        for(int i=1; i<=input; i++){
            num1 = num1 + i;
        }
        num1 = num1 * num1;
        
        return num1 - temp;
    }

}
