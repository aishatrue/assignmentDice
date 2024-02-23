public class DiceConstructor {
    int r;

    public DiceConstructor(int r) {
        this.r = r;

    }

    public int sumDiceNumbers(){
        this.r = this.r +1;
        return r;
    }

    public int getR() {
        return r;
    }

    public void printResult(int i){

        System.out.printf(i+"는 "+"%d번 나왔습니다.\n",this.r);


    }

}
