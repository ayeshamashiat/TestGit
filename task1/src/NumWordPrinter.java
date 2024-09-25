public class NumWordPrinter {
    public void printWord(int n){
        if(n%2==0){
            System.out.println("EVEN");
        }
        else if (n%11==0) {
            System.out.println("PrimeEleven");
        }
        else if (n%13==0){
            System.out.println("LuckyThirteen");
        }
        else if(n%2 ==0 && n%11==0){
            System.out.println("EvenPrimeEleven");
        }
        else if(n%2==0 && n%13==0){
            System.out.println("EvenLuckyThirteen");
        }
        else if(n%11==0 && n%2==0 && n%13==0){
            System.out.println("EvenPrimeLuckyy");
        }

        System.out.println("OddOneOut");
    }
}
