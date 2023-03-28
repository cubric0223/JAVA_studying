import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstN = 0, secondN = 0;
        char op;

        Scanner scanner = new Scanner(System.in);
        System.out.print("실수를 입력해주세요 : ");
        firstN = scanner.nextDouble();

        while (true) {
            System.out.print("계산을 입력하시오 : ");
            op = scanner.next().charAt(0);
            System.out.print("실수를 입력해주세요(종료하려면 q를 입력해주세요) : ");
            secondN = scanner.nextDouble();

            firstN = Calculate(op, firstN, secondN);
            System.out.print("계산결과 : ");
            System.out.println(firstN);
        }
    }

    static double Calculate (char op, double x, double y){
        Scanner scanner = new Scanner(System.in);
        switch (op) {
            case '+':
                x += y;
                break;
            case '-':
                x -= y;
                break;
            case '*':
                x *= y;
                break;
            case '/':
                //'/ 0' 일때
                if (y == 0) {
                    while (y == 0) {
                        System.out.println("0으로 나누었습니다. 다시 입력해주세요");
                        y = scanner.nextDouble();
                    }
                }
                x /= y;
                break;
            case 'q':
                System.exit(1);
        }
        return x;
    }
}