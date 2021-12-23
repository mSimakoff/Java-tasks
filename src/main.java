//3 6 10
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;


import java.sql.Array;

public class main {

    public static void main(String[] args) {
        System.out.println("\nTask 1.1");
        System.out.println(convert(5));

        System.out.println("\nTask 1.4");
        System.out.println(divisibleByFive(5));

        System.out.println("\nTask 1.3");
        System.out.println(footballPoints(5, 0, 2));

        System.out.println("\nTask 1.6");
        System.out.println(howManyWalls(100, 4, 5));

        System.out.println("\nTask 1.10");
        System.out.println(mod(5, 2));

        System.out.println("\nTask 1.9");
        System.out.println(frames(1,1));

        System.out.println("\nTask 1.8");
        System.out.println(profitableGamble(0.2, 50, 9));

        System.out.println("\nTask 1.7");
        System.out.println(squared(5));

        System.out.println("\nTask 1.5");
        System.out.println(and(true,false));

        System.out.println("\nTask 1.2");
        System.out.println(points(13, 12));

        System.out.println("\n++++++++++++++2 блок+++++++++++++");

        System.out.println("\nTask 2.1");
        repeat("example",4);

        System.out.println("\n\nTask 2.2");
        int [] num= new int[] {2,3,4,5,29,1000,39};
        System.out.println(differenceMaxMin(num));

        System.out.println("\nTask 2.3");
        System.out.println(isAvgWhole(num));

        System.out.println("\nTask 2.4");
        System.out.println(Arrays.toString(cumulativeSum(num)));

        System.out.println("\nTask 2.5");
        System.out.println(getDecimalPlaces("23.781"));

        System.out.println("\nTask 2.6");
        System.out.println(Fibonacci(7));

        System.out.println("\nTask 2.7");
        System.out.println(isValid("2144_2"));

        System.out.println("\nTask 2.8");
        System.out.println(isStrangePair("sparkling", "groups") );
        System.out.println(isStrangePair(" ", " ") );

        System.out.println("\nTask 2.9");
        System.out.println(isPrefix("automation","-auto"));
        System.out.println(isSuffix("arachnophobia","phobia-"));

        System.out.println("\nTask 2.10");
        System.out.println(boxSeq(3));
        System.out.println(boxSeq(6));

        System.out.println("\n++++++++++++++3 блок+++++++++++++");

        System.out.println("\nTask 3.1");
        System.out.println(solutions(1, 0, 0));

        System.out.println("\nTask 3.2");
        System.out.println(findZip("all zip files are zipped"));

        System.out.println("\nTask 3.3");
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(28));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(12));
        System.out.println(checkPerfect(97));


        System.out.println("\nTask 3.4");
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(flipEndChars("Two it's a pair"));

        System.out.println("\nTask 3.5");
        System.out.println(isValidHexCode("#CD5C5C"));

        System.out.println("\nTask 4.1");
        System.out.println(textProc(10,7,"hello my name is Bessie and this is my essay"));

        System.out.println("\nTask 4.2");
        System.out.println(Arrays.toString(split("((()))(())()()(()())")));

        System.out.println("\nTask 4.3");
        System.out.println(toCamelCase("hello_edabit"));
        System.out.println(toSnakeCase("helloEdabit"));

        System.out.println("\nTask 4.4");
        double arr34[] = {13.25, 15, 30, 1.5};
        System.out.println(overTime(arr34));

        System.out.println("\nTask 4.5");
        System.out.println(BMI("154 pounds", "2 meters"));

        System.out.println("\nTask 4.6");
        System.out.println(bugger(999));

        System.out.println("\nTask 4.7");
        System.out.println(toStarShorthand("abbccc"));

        System.out.println("\nTask 4.8");
        System.out.println(doesRhyme("and frequently do?", "you gotta move."));

        System.out.println("\nTask 4.9");
        System.out.println(trouble(666789, 12345667));

        System.out.println("\nTask 4.10");
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));

        System.out.println("\nTask 5.1");
        encrypt("Sunshine");
        System.out.println(decrypt(new int[]{72, 33, -73, 84, -12, -3, 13, -13, -68}));

        System.out.println("\nTask 5.2");
        System.out.println(canMove("Queen", "C4", "D6"));

        System.out.println("\nTask 5.3");
        System.out.println(canComplete("tulb","beautiful"));

        System.out.println("\nTask 5.4");
        System.out.println(sumDigProd(16,28));

        System.out.println("\nTask 5.5");
        System.out.println(Arrays.toString(sameVowelGroup("toe", "ocelot", "maniac")));

        System.out.println("\nTask 5.6");
        System.out.println(validateCard(1234567890123452L));

        System.out.println("\nTask 5.7");
        System.out.println(numToEng(99));

        System.out.println("\nTask 5.8");
        System.out.println(getSha256Hash("qwertHey dude!"));

        System.out.println("\nTask 5.9");
        System.out.println(correctTitle("TYRION LANNISTER, HAND OF THE QUEEN."));

        System.out.println("\nTask 5.10");
        System.out.println(hexLattice(7));




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
        return s1.toLowerCase().charAt(0) == s2.toLowerCase().charAt(s2.length()-1) && s2.toLowerCase().charAt(0)
                == s1.toLowerCase().charAt(s1.length()-1);
    }
    //2.9
    public static boolean isPrefix(String word,String prefix){
        return Stream.of(prefix.replace("-","")).anyMatch(word ::startsWith);
    }
    public static boolean isSuffix(String word,String suffix){
        return Stream.of(suffix.replace("-","")).anyMatch(word ::endsWith);
    }

    //2.10
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

    //3.1

    public static int solutions(int a, int b, int c){
        int D = 0;
        if (b*b-4*a*c > 0) D = 2;
        else if (b*b-4*a*c == 0 ) D = 1;
        return D;

    }

    //3.2
    public static int findZip(String str){
        return str.toLowerCase().indexOf("zip", str.indexOf("zip")+1);
    }

    //3.3
    public static boolean checkPerfect(int num) {
         int s = 1;
         for (int i=2 ; i<=(num / 2) ; i++ ){
             if ((num%i)==0) s+=i;
         }
         return (s==num && num!=1);
    }

    //3.4 
    public static String flipEndChars(String s){
        if(s.length()<2) {
            System.out.println("Incompatible");
            return null;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            System.out.println("Two's a pair.");
            return null;
        }
        char[] chars=s.toCharArray();
        char RepCHAR=s.charAt(0);
        char end=s.charAt(s.length()-1);
        chars[0]=end;
        chars[s.length()-1]=RepCHAR;
        s = new String(chars);
        return s;
    }

    //3.5
    public static boolean isValidHexCode(String s){
        return  s.startsWith("#") && s.matches("[\\d#ABCDF]+?");
    }

    //4.1
    public static String textProc(int n, int k, String str)
    {
        String st = "";
        int m = 0; //кол-о сим. на данный момент
        String[] j = new String[n];
        j = str.split(" ");
        for (int i = 0; i < n; i++)
        {
            if (m + j[i].length() < k + 1)
            {
                st = st + " " + j[i];
                m = m + j[i].length();
            } else {
                st = st + "\n" + j[i];
                m = j[i].length();
            }
        }
        return st.trim(); //без пробелов в начале в конце строки
    }

    //4.2
    public static String[] split(String str)
    {
        int m = 0, g = 0, p = 0;
        ArrayList<String> j = new ArrayList<>();
        StringBuilder st = new StringBuilder("");
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '(')
            {
                m++;
                st = st.append("(");
            }
            if (str.charAt(i) == ')')
            {
                g++;
                st = st.append(")");
            }
            if (m == g)
            {
                if (g != 0)
                {
                    j.add(st.toString());
                    p++;
                    st = new StringBuilder();
                }
            }
        }
        return j.toArray(j.toArray(new String[j.size()]));
    }

    //4.3
    public static String toCamelCase(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '_')
            {
                str = str.substring(0, i) + str.substring(i + 1, i + 2).toUpperCase() + str.substring(i + 2, str.length());
            }
        }
        return str;
    }
    public static String toSnakeCase(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) > 'A' && str.charAt(i) < 'Z')
            {
                str = str.substring(0, i) + "_" + str.substring(i, i + 1).toLowerCase() + str.substring(i + 1, str.length());
            }
        }
        return str;
    }

    //4.4
    public static String overTime(double[] arr)
    {
        double k = 0;
        double m = 0;
        //сколько часов проработал сверхурочно до начала раб.дня
        if (9 - arr[0] > 0) {
            k = k + 9 - arr[0];
        }
        //сколько часов проработал сверхурочно после конца раб.дня
        if (arr[1] - 17 > 0) {
            k = k + arr[1] - 17;
        }
        m = arr[1] - arr[0] - k; //общее
        double z = Math.round(arr[2] * (k * arr[3] + m) * 100.0) / 100.0;
        String str = "$";
        str = str + Double.toString(z);
        return str;
    }

    //4.5
    public static String BMI(String str1, String str2)
    {
        double k = 0;
        double c = 0;
        double j;
        String q = " Overweigth", p = " Normal weigth", e = " Underweigth", l = "";
        if(str1.indexOf("k") != -1)
        {
            k = Double.parseDouble(str1.split(" kilos")[0]);
        }
        if(str1.indexOf("p") != -1)
        {
            k = Double.parseDouble(str1.split(" pounds")[0])/2.2;
        }
        if(str2.indexOf("m") != -1)
        {
            c = Double.parseDouble(str2.split(" meters")[0]);
        }
        if(str2.indexOf("i") != -1)
        {
            c = Double.parseDouble(str2.split(" inches")[0])/39;
        }
        j = Math.round(((k/c)/c)*10.0)/10.0;
        if(j < 18.5)
            l = j + e;
        else
        if(j < 24.9)
            l = j + p;
        else
            l = j+q;
        return (l);
    }

    //4.6
    public static int bugger(int n)
    {
        int j = 1, l = n, k = 0;
        while (l/10 >= 1)
        {
            while (l != 0)
            {
                j = j * (l % 10);
                l = l / 10;
            }
            l = j;
            j = 1;
            k++;
        }
        return k;
    }

    //4.7

    public static String toStarShorthand(String str)
    {
        int k = 1;
        for (int i = 1; i < str.length(); i++)
        {
            if (str.charAt(i-1) == str.charAt(i))
            {
                k++;
                str = str.substring(0, i) + str.substring(i+1, str.length());
                i--;
            }
            else
            if(k > 1)
            {
                str = str.substring(0, i) + "*" + k + str.substring(i, str.length());
                k = 1;
            }
        }
        if(k > 1)
            str = str + "*" + k;
        return str;
    }

    //4.8
    public static boolean doesRhyme(String str1, String str2)
    {
        String[] j = new String[str1.length()];
        String[] j1 = new String[str1.length()];
        String[] j2 = new String[str1.length()];
        String[] j3 = new String[str1.length()];
        boolean m = false;
        j = str1.split(" ");
        j1 = str2.split(" ");
        int p = 0, q = 0;
        for (int i = 0; i < j[j.length-1].length(); i++)
        {
            if (j[j.length-1].substring(i, i + 1).matches("^(?i:[aeiouy]).*")) //matches() возращает true, если вся строка совпадает с шаблоном
            {
                j2[p] = j[j.length-1].substring(i, i + 1).toLowerCase();
                p++;
            }
        }
        for (int i = 0; i < j1[j1.length-1].length(); i++)
        {
            if (j1[j1.length-1].substring(i, i + 1).matches("^(?i:[aeiouy]).*"))
            {
                j3[q] = j1[j1.length-1].substring(i, i + 1).toLowerCase();
                q++;
            }
        }
        if (p == q)
        {
            for(int i = 0; i < p; i++)
            {
                if(j2[i].charAt(0) == j3[i].charAt(0))
                {
                    m = true;
                }
                else
                {
                    m = false;
                }
            }
        }
        return m;
    }

    //4.9
    public static boolean trouble(long a, long b)
    {
        long k = a, n = b, c = 0, m = 0, g = 0;
        boolean z = false;
        while (k > 0)
        {
            k = k / 10;
            c++;
        }
        k = a;
        int u[] = new int[(int) c];
        for (long j = c - 1; j >= 0; j--)
        {
            u[(int) j] = (int) (k % 10);
            k = k / 10;
        }
        while (n > 0)
        {
            n = n / 10;
            m++;
        }
        n = b;
        int u1[] = new int[(int) c];
        int u2[] = new int[(int) m];
        for (long j = m - 1; j >= 0; j--)
        {
            u2[(int) j] = (int) (n % 10);
            n = n / 10;
        }
        for(int i = 1; i < c-1; i++)
        {
            if(u[i-1] == u[i] && u[i] == u[i+1])
            {
                u1[(int) g] = u[i];
                g++;
            }
        }
        for(int i = 0; i < m - 1; i++)
        {
            for(int j = 0; j < g; j++)
            {
                if (u1[j] == u2[i] && u1[j] == u2[i+1])
                {
                    z = true;
                }
            }
        }
        return z;
    }

    //4.10
    public static int countUniqueBooks(String str, char bookEnd)
    {
        int k = 0, m, c = 0, b;
        while (str.indexOf(bookEnd) != -1)
        {
            k = str.indexOf(bookEnd);
            m = str.indexOf(bookEnd, k + 1);
            for(int i = k+1; i<m;i++)
            {
                if (str.charAt(i) == str.charAt(i+1))
                {
                    c--;
                }
            }
            str = str.substring(m+1);
            c = c + m - k - 1;
        }
        return c;
    }

    //5.1
    public static int[] encrypt(String str)
    {
        int[] a = new int[str.length()];
        a[0] = str.charAt(0);
        for(int i = 1; i < str.length(); i++)
        {
            a[i] = str.charAt(i) - str.charAt(i - 1);
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
    public static String decrypt(int[] a)
    {
        String str = "";
        int sum = a[0];
        str = str + (char) a[0];
        for(int i = 1; i < a.length; i++)
        {
            str = str + (char) (sum + a[i]);
            sum += a[i];
        }
        return str;
    }

    //5.2
    public static boolean canMove(String str1, String str2, String str3)
    {
        boolean m = false;
        int a,b,c,d;
        a = (int)str2.charAt(0); //код символа
        b = (int)str3.charAt(0);
        c = (int)str2.charAt(1); //код цифры
        d = (int)str3.charAt(1);
        switch (str1) {
            case  ("Pawn"): //пешка
                if((d - c >= 1) && (a == b))
                {
                    m = true;
                }
                break;
            case  ("Rook"): // ладья
                if((a == b && Math.abs(d - c) >= 1) || (c == d && Math.abs(a - b) > 0))
                {
                    m = true;
                }
                break;
            case ("Knight"): //конь
                if(((Math.abs(c - d) == 2) && (Math.abs(a - b) == 1)) || ((Math.abs(c - d) == 1) && (Math.abs(a - b) == 2)))
                {
                    m = true;
                }
                break;
            case ("Bishop"): //слон
                if(Math.abs(a - b) == Math.abs(c - d))
                {
                    m = true;
                }
                break;
            case  ("Queen"): //Ферзь
                if((a == b && Math.abs(d - c) >= 1) || (c == d && Math.abs(a - b) > 0) || (Math.abs(a - b) == Math.abs(c - d)))
                {
                    m = true;
                }
                break;
            case  ("King"): //король
                if((a == b && Math.abs(d - c) == 1) || (c == d && Math.abs(a - b) == 1) || (Math.abs(a - b) == Math.abs(c - d) && Math.abs(d - c) == 1 && Math.abs(a - b) == 1))
                {
                    m = true;
                }
                break;
            default:
                break;
        }
        return m;
    }

    //5.3
    public static boolean canComplete(String str1, String str2)
    {
        boolean m = true;
        int a = 0;
        int arr[] = new int[str1.length()];
        for(int i = 0; i < str2.length(); i++)
        {
            if(str1.charAt(a) == str2.charAt(i))
            {
                arr[a] = i;
                a++;
            }
            if(a==0)
                return false;
        }
        for(int i = 0; i < str1.length()-1; i++)
        {
            if(arr[i] >= arr[i+1])
            {
                m = false;
            }
        }
        return m;
    }

    //5.4
    public static int sumDigProd(int... n)
    {
        int sum = 0;
        int pr = 1;
        for(int i = 0; i < n.length; i++)
        {
            sum += n[i];
        }
        while (sum / 10 >= 1)
        {
            while (sum != 0)
            {
                pr = pr * (sum % 10);
                sum = sum / 10;
            }
            sum = pr;
            pr = 1;
        }
        return sum;
    }

    //5.5
    public static String[] sameVowelGroup(String... n)
    {
        int p = 1; //счётчик удовлетворяющих слов
        boolean y = true;
        String q = "";
        String[] j = new String[n.length];
        j[0] = n[0];
        for(int j1 = 0; j1 < n[0].length(); j1++)
        {
            if ((n[0].substring(j1, j1+1).matches("^(?i:[aeiouy]).*")) && !q.contains(n[0].substring(j1, j1+1)))
            {
                q = q + n[0].substring(j1, j1 + 1);
            }
        }
        for (int i = 1; i < n.length; i++)
        {
            for(int j1 = 0; j1 < n[i].length(); j1++)
            {
                if (n[i].substring(j1, j1+1).matches("^(?i:[aeiouy]).*"))
                {
                    if (!q.contains(n[i].substring(j1, j1 + 1)))
                    {
                        y = false;
                    }
                }
            }
            if(y)
            {
                j[p] = n[i];
                p++;
            }
            y = true;
        }
        String[] arr = new String[p];
        for(int i = 0; i < p; i++)
        {
            arr[i] = j[i];
        }
        return arr;
    }

    //5.6
    public static boolean validateCard(long a)
    {
        long b = 0, c, d = 0, p;
        String io = "";
        int u[] = new int[19];
        c = a % 10; //удаленная последняя цифра
        a = a / 10;
        p = a;
        while(p > 0)
        {
            p = p / 10;
            b++;
        }
        for (int i = 0; i < b; i++) //переворот
        {
            io = "" + a % 10;
            u[i] = Integer.parseInt(io);
            a = a / 10;
        }
        for (int i = 0; i < b; i++) //удвоение
        {
            if(i % 2 == 0)
            {
                if(u[i] * 2 < 10)
                {
                    u[i] = u[i] * 2;
                }
                else
                {
                    u[i] = (u[i] * 2) % 10 + (u[i] * 2) / 10;
                }
            }
            d = d + u[i];
        }
        return (10 - d % 10 == c);
    }

    //5.7
    public static String numToEng(int n)
    {
        String[] tensNames = {"", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};
        String[] numNames = {"zero", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};
        String so;
        if (n % 100 < 20)
        {
            so = numNames[n % 100];
            n /= 100;
        }
        else
        {
            so = numNames[n % 10];
            n /= 10;

            so = tensNames[n % 10] + so;
            n /= 10;
        }
        if (n == 0) return so.trim();
        return (numNames[n] + " hundred" + so).trim();
    }

    //5.8
    public static String getSha256Hash(String str)
    {
        MessageDigest digest = null;
        try
        {
            digest = MessageDigest.getInstance("SHA-256"); //Создание экземпляра MessageDigest
        } catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        byte[] hash = new byte[0];
        hash = digest.digest(str.getBytes()); //Вычисление дайджеста сообщения (конвертация строки в байты)
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++)
        {
            String hex = Integer.toHexString(0xff & hash[i]); //Форматирование в 16 цифры
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    //5.9
    public static String correctTitle(String str)
    {
        String[] j = new String[str.length()];
        j = str.split(" ");
        String str1 = "";
        for (int i = 0; i < j.length; i++)
        {
            if((j[i].charAt(0) != ',') && (j[i].charAt(0) != '.') && (j[i].charAt(0) != ';') && (j[i].charAt(0) != ':'))
            {
                if (!(j[i].toLowerCase().equals("the")) && !(j[i].toLowerCase().equals("in")) && !(j[i].toLowerCase().equals("of")) && !(j[i].toLowerCase().equals("and")))
                {
                    str1 = str1 + " " + j[i].substring(0, 1).toUpperCase() + j[i].substring(1).toLowerCase();
                }
                else
                {
                    str1 = str1 + " " + j[i].toLowerCase();
                }
            }
        }
        return str1.trim();
    }

    //5.10
    public static String hexLattice(int n)
    {
        String ans = "";
        int temp = 1;
        int l;
        for(l = 1; temp < n; ++l)
        {
            temp += l * 6;
        }
        if (temp != n)
        {
            return "Invalid";
        }
        else
        {
            int i;
            int j;
            for(i = l; i <= 2 * l - 1; ++i)
            {
                ans = ans + rept(" ", 2 * l - i);

                for(j = 0; j < i; ++j)
                {
                    ans = ans + " o";
                }

                ans = ans + "\n";
            }
            for(i = 2 * l - 2; i >= l; --i)
            {
                ans = ans + rept(" ", 2 * l - i);

                for(j = 0; j < i; ++j)
                {
                    ans = ans + " o";
                }

                ans = ans + "\n";
            }
            return ans;
        }
    }


    public static String rept(String l, int n)
    {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < l.length(); i++)
        {
            for (int j = 0; j < n; j++)
            {
                s.append(l.charAt(i));
            }
        }
        String j = s.toString();
        return j;
    }

}


