public class Main {
    public static void main(String[] args) {
        // Задание 1
            int horse = 8;
            byte pig = 2;
            short goat = 5;
            long rat = 20L;
            double grainWeight = 6.5;
            float milkWeight = 2.7f;

        // Задание 2
            double boxer1 = 78.2;
            double boxer2 = 82.7;
            double weightOfAllBoxers = boxer1 + boxer2;
            double weightDifference = boxer2 - boxer1;
            System.out.println("Общий вес боксеров " + weightOfAllBoxers);
            System.out.println("Разница в весе боксеров " + weightDifference);

       // Задание 3
            short AllBananas = 5;
            int BananaWeight = 80;
            long WeightAllBananas = AllBananas * BananaWeight;
            System.out.println("Вес бананов " + WeightAllBananas);

            int Milk = 200;
            int Milk100Ml = 105;
            int Milk105Capacity = 100;
            int MilkAllWeight = Milk100Ml * 2;
            System.out.println("Вес молока " + MilkAllWeight);

            int IceCream = 2;
            int IceCreamWeight = 100;
            int IceCreamAllWeight = IceCream * IceCreamWeight;
            System.out.println("вес мороженного " + IceCreamAllWeight);

            int Eggs = 4;
            int EggWeight = 70;
            int EggsAllWeight = Eggs * EggWeight;
            System.out.println("Вес яиц " + EggsAllWeight);

            long AllWeight = WeightAllBananas + MilkAllWeight + IceCreamAllWeight + EggsAllWeight;
            System.out.println("Вес завтрака " + AllWeight);


      // Задание 4

            int Intent = 7;
            int KgTranslateToG = 1000;
            int IntentG = Intent * KgTranslateToG;
            System.out.println("Перевод в граммы " + IntentG);
            int OneDay = 250;
            int HowManyDays250 = IntentG / OneDay;
            System.out.println("Дней по 250г " + HowManyDays250);

            int OneDay2 = 500;
            int HowManyDays500 = IntentG / OneDay2;
            System.out.println("Дней по 500г " + HowManyDays500);

            int SumDays = HowManyDays250 + HowManyDays500;
            int AmountOfPoints = 2;
            int Average = SumDays / AmountOfPoints;
            System.out.println("Дней в среднем " + Average);


       // Задание 5

             int Masha = 67760;
             int Denis = 83690;
             int Kris = 76230;
             int Percent = 10;
             int PercentHundred = 100;
             int TenPercentMasha = Masha * Percent / PercentHundred;
             int MashaPlus = Masha + TenPercentMasha;
             System.out.println("Маша теперь получает " + MashaPlus);
             int MashaDifference = MashaPlus - Masha;
             int Year = 12;
             int DifferencePerYear = MashaDifference * Year;
             System.out.println("Годовой доход Маши вырос на " + DifferencePerYear);

             int TenPercentDenis = Denis * Percent / PercentHundred;
             int DenisPlus = Denis + TenPercentDenis;
             System.out.println("Денис теперь получает " + DenisPlus);
             int DenisDifference = DenisPlus - Denis;
             int DifferencePerYearD = DenisDifference * Year;
             System.out.println("Годовой доход Дениса вырос на " + DifferencePerYearD);

             int TenPercentKris = Kris * Percent / PercentHundred;
             int KrisPlus = Kris + TenPercentKris;
             System.out.println("Кристина теперь получает " + KrisPlus);
             int KrisDifference = KrisPlus - Kris;
             int DifferencePerYearK = KrisDifference * Year;
             System.out.println("Годовой доход Кристины вырос на " + DifferencePerYearK);



    }
}