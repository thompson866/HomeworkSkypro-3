public class Main {
    public static void main(String[] args) {

        //Задача 1//
        System.out.println("Задача 1");
        int paper1 = 10;
        System.out.println("Значение переменной int с типом int равно " + paper1);
        byte paperNews = 15;
        System.out.println("Значение переменной byte с типом равно " + paperNews);
        short paperTwoNews = 42;
        System.out.println("Значение переменной short с типом равно " + paperTwoNews);
        long paperToday = 799564;
        System.out.println("Значение переменной long с типом равно " + paperToday);
        float oldWeight = 2;
        System.out.println("Значение переменной float с типом равно " + oldWeight);
        double weight = 1.45;
        System.out.println("Значение переменной doudle с типом равно " + weight);

        //Задача 2//
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987648965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        //Задача 3//
        System.out.println("Задача 3");
        byte studentA = 23;
        byte studentB = 27;
        byte studentC = 30;
        short paper = 480;
        int paperStudent = paper / (studentA+studentB+studentC);
        System.out.println("На каждого ученика рассчитано " +paperStudent + " листов бумаги");

        //Задача 4//
        System.out.println("Задача 4");
        byte bottle = 16;
        int timeMinute = bottle / 2;
        byte timeMinute20 = 20;
        int bottleFinishMinute20 = timeMinute * timeMinute20;
        System.out.println("За " + timeMinute20 + " минут машина произвела " + bottleFinishMinute20 +" штук бутылок");
        int day = timeMinute * 60 * 24;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int threeDay = day * 3;
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        int month = day * 30;
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

        //Задача 5//
        System.out.println("Задача 5");
        byte pinPaint = 120;
        byte oneClassWhite = 2;
        byte oneClassBrown = 4;
        int totalClass = pinPaint / (oneClassWhite + oneClassBrown);
        int pinWhite = totalClass * oneClassWhite;
        int pinBrown = totalClass * oneClassBrown;

        System.out.println("В школе, где " + totalClass + " классов, нужно " + pinWhite +  " банок белой краски и " + pinBrown + " банок коричневой краски");

        //Задача 6//
        System.out.println("Задача 6");
        short bananaWeight = 5 * 20;
        short milkWeight = 2 * 105;
        short icecreamWeight = 2 * 100;
        short egsWeight = 4 * 70;
        float breakfastWeight = bananaWeight + milkWeight + icecreamWeight + egsWeight;
        System.out.println("Порция завтрака спортсмена " + breakfastWeight + " грамм");
        float breakfastWeight2 = breakfastWeight / 1000;
        System.out.println("Порция завтрака спортсмена " + breakfastWeight2 + " килограмма");

        //Задача 7//
        System.out.println("Задача 7");
        short totalWeightSport = 7 * 1000;
        short introDay = 250;
        short introDay2 = 500;
        int loseWeightDay = totalWeightSport / introDay;
        System.out.println("На похудение при потере " + introDay + " в день потребуется " + loseWeightDay + " дней");
        int loseWeightDay2 = totalWeightSport / introDay2;
        System.out.println("На похудение при потере " + introDay2 + " в день потребуется " + loseWeightDay2 + " дней");
        int loseWeight = totalWeightSport / ((introDay + introDay2) / 2);
        System.out.println("В среднем на похудение уйдет " + loseWeight + " дней");

        //Задача 8//
        System.out.println("Задача 8");
        int masha = 67780;
        int mashaNew = masha + (masha*10/100);
        int differenceMasha = mashaNew - masha;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");

        int denis = 83690;
        int denisNew = denis + (denis*10/100);
        int differenceDenis = denisNew - denis;
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");

        int cris = 76230;
        int crisNew = cris + (cris*10/100);
        int differenceCris = crisNew - cris;
        System.out.println("Кристина теперь получает " + crisNew + " рублей. Годовой доход вырос на " + differenceCris + " рублей");




    }
}