package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int result = number01 + number02;
        double result02 = number01 / (double) number02;
        System.out.println(result);
        System.out.println(result02);

        // %
        int rest = 21 % 5;
        System.out.println(rest);

        // <> <= >= == !=  logic operator
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualsThanTwenty = 10 == 20;
        boolean isTenDifferentThanTwenty = 10 != 20;

        System.out.println("Is Ten greater than twenty: "+isTenGreaterThanTwenty);
        System.out.println("Is Ten less than twenty: "+isTenLessThanTwenty);
        System.out.println("Is Ten equals than twenty: "+isTenEqualsThanTwenty);
        System.out.println("Is Ten different than twenty: "+isTenDifferentThanTwenty);

        // &&(AND) e ||(OR) e !(NOT) logic operator
        int age = 44;
        float salary = 3500F;
        boolean isWithinTheLawGreaterThanThirty =  age >= 30 && salary >= 4612;
        boolean isWithinTheLawLessThanThirty =  age < 30 && salary >= 3381;

        System.out.println("Is within the law greater than thirty: "+isWithinTheLawGreaterThanThirty);
        System.out.println("Is within the law less than thirty: "+isWithinTheLawLessThanThirty);

        double isTotalAmountCurrentAccount = 200;
        double isTotalAmountSalaryAccount = 10000;
        float valuePlaystation = 5000F;
        boolean isPlaystationFiveBuy = isTotalAmountCurrentAccount > valuePlaystation || isTotalAmountSalaryAccount > valuePlaystation;
        System.out.println("Is Playstation coast Five Buy: "+isPlaystationFiveBuy);

        // = += -= *= /= %=  attrib operator
        double bonus = 1800;
        bonus += 1000; //1800
        bonus -= 1000; //2800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("Is bonus equals: "+bonus);

        //accountant
        int accountant = 0;
        accountant += 1; // accountant = accountant + 1
        accountant++; //2
        accountant--; //1
        ++accountant; //2
        --accountant; //1

        int accountant2 = 0;
        System.out.println(++accountant2);


        System.out.println(accountant);

    }
}
