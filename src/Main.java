import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws TrowExeprion {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пример, где значения вводятся через пробел");
        String calc = in.nextLine();
        String[] c = calc.split(" ");
        String[] c1 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV","XVI", "XVII", "XVIII","XIX","XX",
        "XXI", "XXII","XXIII","XXIV","XXV","XXVI", "XXVII","XXVIII", "XXIX","XXX","XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
        "XXXIX", "XL", "XLI","XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI","LII","LIII","LIV","LV","LVI", "LVII","LVIII","LIX",
        "LX", "LXI","LXII","LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI","LXXVII","LXXVIII",
        "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI","LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII","XCIII","XCIV","XCV","XCVI",
        "XCVII","XCVIII","XCIX","C"};
        String num1 = c[0];
        String num2 = c[2];
        int k1=0;
        int k2=0;
        int first = 0;
        int second = 0;
        int x1 = 0;
        String x2 = "0";
        if (num1.equals("1") | num1.equals("2") | num1.equals("3") | num1.equals("4") | num1.equals("5") |num1.equals("6") | num1.equals("7") | num1.equals("8") | num1.equals("9") | num1.equals("10") ){
            first = Integer.valueOf(num1);
        }
        else {
            for (int i = 0; i<c1.length; i++) {
                if (num1.equals(c1[i])) {
                    first = i + 1;
                    k1 = 1;
                }
            }
        }
        if (num2.equals("1") | num2.equals("2") | num2.equals("3") | num2.equals("4") | num2.equals("5") |num2.equals("6") | num2.equals("7") | num2.equals("8") | num2.equals("9") | num2.equals("10") ){
            second = Integer.valueOf(num2);
        }
        else {
            for (int i = 0; i<c1.length; i++) {
                if (num2.equals(c1[i])) {
                    second = i + 1;
                    k2 = 1;
                }
            }
        }
        int x = 0;
        if ((k1 == 0) && (k2 == 0)){
            switch (c[1]){
                case "+" :
                    x = first +second;
                    break;
                case "-" :
                    x = first - second;
                    break;
                case "*":
                    x = first * second;
                    break;
                case "/":
                    x = first / second;
                    break;
            }
        }
        else if ((k1 == 0) && (k2 == 1)){
            throw new TrowExeprion();
        }
        else if ((k1 == 1) && (k2 == 0)){
            throw new TrowExeprion();
        }
        else if ((k1 == 1) && (k2 == 1)){
            switch (c[1]){
                case "+" :
                    x = first +second;
                    break;
                case "-" :
                    x = first - second;
                    break;
                case "*":
                    x = first * second;
                    break;
                case "/":
                    x = first / second;
                    break;
            }
            if (x <= 0){
                throw new TrowExeprion();
            }
            else {
                x2 = c1[x-1];
            }
        }

        if ((first >= 1) && (first <=10) && (second >= 1) && (second <=10) && (k1 == 1 ) && (k2 == 1)){
            System.out.println("Ваше получившееся число:");
            System.out.println(x2);
        } else if ((first >= 1) && (first <= 10) && (second >=1) && (second <= 10) && (k1 == 0) && (k2 == 0)){
            System.out.println("Ваше получившееся число:");
            System.out.println(x);

        } else {
            System.out.println("Числа не подходят");
        }
    }
}
