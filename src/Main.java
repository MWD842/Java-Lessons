import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Q1
//        System.out.println("Hello, World!");

        // Q2
//        int age = 20;
//        String name = "Aruzhan";
//        System.out.println("Name: "+name);
//        System.out.println("Age: "+age);

        // Q3
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a+b);

        // Q4
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if (num>0){
//            System.out.println("POSITIVE");
//        } else if(num==0){
//            System.out.println("ZERO");
//        } else {
//            System.out.println("NEGATIVE");
//        }

        // Q5
//        for(int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }

        // Q6
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if (num % 2 == 0){
//            System.out.println("EVEN");
//        } else {
//            System.out.println("ODD");
//        }

        // Q7
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a>b){
//            System.out.println(a);
//        } else if (a == b){
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }

        // Q8
//        Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();
//        switch(month){
//            case 12,1,2:
//                System.out.println("Winter");
//                break;
//            case 3,4,5:
//                System.out.println("Spring");
//                break;
//            case 6,7,8:
//                System.out.println("Summer");
//                break;
//            case 9,10,11:
//                System.out.println("Autumn");
//                break;
//            default:
//                System.out.println("Invalid value");
//        }

        // Q9
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i = num; i>=1; i--){
//            System.out.println(i);
//        }

        // Q10
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age >= 18){
//            System.out.println("Adult");
//        } else {
//            System.out.println("Not adult");
//        }

        // Q11
//        Scanner sc = new Scanner(System.in);
//        int grade = sc.nextInt();
//        if ((100 >= grade)&&(90 <= grade)){
//            System.out.println("A");
//        } else if ((89 >= grade)&&(75 <= grade)){
//            System.out.println("B");
//        } else if ((74 >= grade)&&(50 <= grade)){
//            System.out.println("C");
//        } else if ((49 >= grade)&&(0 <= grade)) {
//            System.out.println("F");
//        } else {
//            System.out.println("Invalid value");
//        }

        // Q12
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i<=N; i++){
//            if (i % 2 == 0){
//                sum=sum+i;
//            }
//        }
//        System.out.println(sum);

        // Q13
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int factorial = 1;
//        if (N > 0){
//            for(int i = N; i >= 1; i--){
//                factorial = factorial * i;
//            }
//            System.out.println(factorial);
//        } else if (N == 0){
//            System.out.println(factorial);
//        } else {
//            System.out.println("Invalid value");
//        }

        // Q14
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for(int i=1; i<=N; i++){
//            if (i%2!=0){
//                System.out.println(i);
//            }
//        }

        // Q15
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if (a>b){
//            if (a>c){
//                System.out.println(a);
//            } else {
//                System.out.println(c);
//            }
//        } else if (b>c){
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }

        // Q16
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        while(num!=1){
//            if (num % 2 == 0){
//                num = num / 2;
//            } else {
//                break;
//            }
//        }
//        if (num == 1){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

        // Q17
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum = 0;
//        while(num != 0){
//            sum = sum + (num % 10);
//            num = num / 10;
//        }
//        System.out.println(sum);

        // Q18
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 1; i<=N; i++){
//            if ((i%3==0)&&(i%5==0)){
//                System.out.println("FizzBuzz");
//            } else if (i%3==0){
//                System.out.println("Fizz");
//            } else if (i%5==0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // Q19
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int count = 0;
//        for(int i = 1; i <= N; i++){
//            if(i%3==0){
//                count = count + 1;
//            }
//        }
//        System.out.println(count);

        // Q20
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 1; i <= N; i++){
//            if (i!= 1) {
//                System.out.println("");
//            }
//            for (int x = 1; x <= i; x++){
//                System.out.print("*");
//            }
//        }

        // Q21
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i<=num; i++){
            if (i%4==0){
                System.out.println(i);
                continue;
            }
        }
    }
}