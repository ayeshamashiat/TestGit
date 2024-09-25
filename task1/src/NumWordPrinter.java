public class NumWordPrinter {
    public String printWord(int n){
        if(n%2==0){
            return "EVEN";
        }
        else if (n%11==0) {
            return "PrimeEleven";
        }
        else if (n%13==0){
            return "LuckyThirteen";
        }
        else if(n%2 ==0 && n%11==0){
            return "EvenPrimeEleven";
        }
        else if(n%2==0 && n%13==0){
            return "EvenLuckyThirteen";
        }
        else if(n%11==0 && n%2==0 && n%13==0){
            return "EvenPrimeLuckyy";
        }

        return "OddOneOut";
    }
}
