public class Main {
    public static void main(String[] args) {
        byte apple = 2;
        short lemon = 130;
        int box = 727525;
        long rubles = 1000000000L;
        float hours = 17.4f;
        double pi = 3.141592635;
        System.out.println("Task 1");

        System.out.println("Значение переменной apple с типом byte равно " + apple);
        System.out.println("Значение переменной lemon с типом lemon равно " + lemon);
        System.out.println("Значение переменной box с типом int равно " + box);
        System.out.println("Значение переменной rubles с типом long равно " + rubles);
        System.out.println("Значение переменной hours с типом long равно " + hours);
        System.out.println("Значение постоянной Pi с типом long равно " + pi);

        System.out.println("Task 2");

        float number1 = 27.12f;
        long number2 = 987678965549L;
        float number3 = 2.786f;
        short number4 = 569;
        short number5 = -159;
        int number6 = 27897;
        byte number7 = 67;

        System.out.println("Task 3");
        short classLP = 23;
        short classAS = 27;
        short classEA = 30;
        short students = (short) (classEA + classAS + classLP);
        short list = 480;
        float listPerStudent = (float) (list / students);
        System.out.println("На каждого ученика рассчитано " + listPerStudent + " листов бумаги.");

        System.out.println("Task 4");
        int bottles = 16;
        int time = 2;
        int capacity = (short) (bottles / time);
        int count = 0;

        time = 20;
        count = capacity * time;
        System.out.println("За " + time + " минут машина произвела " + count + " штук бутылок.");

        time = 60 * 24;
        count = capacity * time;
        System.out.println("За " + time + " минут (сутки) машина произвела " + count + " штук бутылок.");

        time = time * 3;
        count = capacity * time;
        System.out.println("За " + time + " минут (3 суток) машина произвела " + count + " штук бутылок.");

        time = 60 * 24 * 30;
        count = capacity * time;
        System.out.println("За " + time + " минут (месяц в 30 дней) машина произвела " + count + " штук бутылок.");

        System.out.println("Task 5");

        byte jarOfPaint = 120;
        byte whiteJarPerClass = 2;
        byte brownJarPerClass = 4;
        byte jarPerClass = (byte) (whiteJarPerClass + brownJarPerClass);
        byte numberOfClasses = (byte) (jarOfPaint / jarPerClass);
        byte whiteJars = (byte) (numberOfClasses * whiteJarPerClass);
        byte brownJars = (byte) (numberOfClasses * brownJarPerClass);
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whiteJars
                + " банок белой краски и " + brownJars + " банок коричневой краски");

        System.out.println("Task 6");

        int weightBanana = 80;
        int weightMilk = 105;
        int weightEgg = 70;
        int weightIceCream = 100;
        int countBanana = 5;       //количество бананов
        int countMilkBy100gr = 2;  //указывайте количество, сколько раз по 100мл молока используется в рецепте
        int countEgg = 4;          //количество яиц
        int countIceCream = 2;     //количество брикетов мороженого

        int recipeWeight = weightBanana * countBanana + weightEgg * countEgg + weightMilk * countMilkBy100gr + weightIceCream * countIceCream;
        double breakfastWeight = recipeWeight / 1000.000;
        System.out.println("Вес завтрака составляет: " + recipeWeight + " грамм. Или " + breakfastWeight + " килограмм.");

        System.out.println("Task 7");
        int targetWeight = 7 * 1000;
        int minLossesWeight = 250;
        int maxLossesWeight = 500;
        int minDays = targetWeight / maxLossesWeight;
        int maxDays = targetWeight / minLossesWeight;
        float averageDays = (float) ((minDays + maxDays) / 2);
        System.out.println("Дней до цели при потере 250 грамм в день: " + maxDays);
        System.out.println("Дней до цели при потере 500 грамм в день: " + minDays);
        System.out.println("Среднее количество дней до цели: " + averageDays);

        System.out.println("Task 8");
        float salary = 0;
        float newSalary = (float) (salary * 1.1);
        float diffYearSalary = (newSalary - salary) * 12;
        salary = 67760;
        newSalary = (float) (salary * 1.1);
        diffYearSalary = (newSalary - salary) * 12;
        System.out.println("Маша теперь получает " + newSalary + " рублей. Её годовой доход вырос на " + diffYearSalary + " рублей.");
        salary = 83690;
        newSalary = (float) (salary * 1.1);
        diffYearSalary = (newSalary - salary) * 12;
        System.out.println("Денис теперь получает " + newSalary + " рублей. Его годовой доход вырос на " + diffYearSalary + " рублей.");
        salary = 76230;
        newSalary = (float) (salary * 1.1);
        diffYearSalary = (newSalary - salary) * 12;
        System.out.println("Кристина теперь получает " + newSalary + " рублей. Её годовой доход вырос на " + diffYearSalary + " рублей.");

    }
}