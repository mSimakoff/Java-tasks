//3 6 10
import java.util.stream.Stream;

import java.sql.Array;

public class main {

    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(divisibleByFive(5));
        System.out.println(footballPoints(5, 0, 2));
        System.out.println(howManyWalls(100, 4, 5));
        System.out.println(mod(5, 2));
        System.out.println(frames(1,1));
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(squared(5));
        System.out.println(and(true,false));
        System.out.println(points(13, 12));
        System.out.println("++++++++++++++2 блок+++++++++++++");
        repeat("example",4);
        System.out.println(" ");
        int [] num= new int[] {2,3,4,5,29,1000,39};
        System.out.println(differenceMaxMin(num));
        System.out.println(isAvgWhole(num));
        System.out.println("__ ");
        System.out.println(cumulativeSum(num));
        System.out.println(" __");
        System.out.println(getDecimalPlaces("23.781"));
        System.out.println(Fibonacci(7));
        System.out.println(isValid("2144_2"));
        System.out.println(isStrangePair("sparkling", "groups") );
        System.out.println(isPrefix("automation","-auto"));
        System.out.println(isSuffix("arachnophobia","phobia-"));
        System.out.println(boxSeq(3));
        System.out.println(boxSeq(6));

    }

    //1
    public static int convert ( int x){
        return (x * 60);
    }

    //4
    public static boolean divisibleByFive (int x){
        return x % 5 == 0;
    }

    //3
    public static int footballPoints(int wins, int nn, int lose) {
        return wins * 3 + nn;
    }

    //6
    public static int howManyWalls(int n, int w, int h){
        return n/(w*h);
    }

    //10
    public static int mod(int ch1, int ch2){
        return ch1-(ch1/ch2)*ch2;
    }

    //9
    public static int frames(int frames, int minute){
        return frames*minute*60;
    }

    //8
    public static boolean profitableGamble(double prob, int prize, int pay){
        return (prob*prize)>pay;
    }

    //7
    public static int squared(int b) {
        return b * b;
    }

    //5
    public static boolean and(boolean a, boolean b){
        return a&&b;
    }

    //2
    public static int points(int b2, int b3){
        return b2*2+b3*3;
    }

    //11
    public static void repeat(String s,int count){
        char [] charArray = s.toCharArray();
        for (int i=0; i<charArray.length;i++) {
            for (int j = 0; j < count; j++)
                System.out.print(charArray[i]);
        }
    }

    //12
    public static int differenceMaxMin(int[] arr){
        int max =Integer.MIN_VALUE , min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(min > arr[i]){
                min=arr[i];
            }
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return (max-min);
    }

    //13
    public static boolean isAvgWhole(int[] arr){
        float mid = 0;
        for(int i=0; i<arr.length; i++){
            mid+=arr[i];
        }
        return (mid/arr.length)%1 == 0;
    }

    //14 пока не работает вывод
    public static int[] cumulativeSum(int[] arr){
        int cumSum = 0;
        for(int i=0; i<arr.length; i++){
            cumSum+=arr[i];
            arr[i]=cumSum;
            System.out.println(arr[i]);
        }
        return arr;
    }

    //15 без костылей
    public static int getDecimalPlaces(String s){
        s = s.substring(s.indexOf("."));
        char[] ch=s.toCharArray();
        return ch.length-1;
    }

    //16 ??
    public static int Fibonacci(int fib){
        int[] num = new int[] { 0, 1, 2};
        int rfib = 0;
        for(int i=2; i<fib; i++){
            num[0]=num[1];
            num[1]=num[2];
            num[2]=num[0]+num[1];
            rfib = num[2];
        }

        return rfib;
    }

    //17
    public static boolean isValid(String index){
            return (index.length() == 5) && index.matches("[\\d]+");
    }

    //18
    public static boolean isStrangePair(String s1,String s2){
        return s1.toLowerCase().charAt(0) == s2.toLowerCase().charAt(s2.length()-1)
                && s2.toLowerCase().charAt(0) == s1.toLowerCase().charAt(s1.length()-1);
    }
    //19
    public static boolean isPrefix(String word,String prefix){
        return Stream.of(prefix.replace("-","")).anyMatch(word ::startsWith);
    }
    public static boolean isSuffix(String word,String suffix){
        return Stream.of(suffix.replace("-","")).anyMatch(word ::endsWith);
    }

    //20
    public static int boxSeq(int step){
        int Fields=0;
        for(int i=1; i<=step;i++){
            if (i %2 !=0)
                Fields+=3;
            else
                Fields-=1;
        }
        return Fields;
    }
}


