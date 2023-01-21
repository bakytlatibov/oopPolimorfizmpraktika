public class HenFActory {

    public static void HenFActory(String a) {

        if (a.equals("RussianHen")) {
            System.out.println(new RussianHen().getDescription());
            System.out.println();
            System.out.println(new RussianHen().getCountOfEggsPerMonth());


        } else if (a.equals("UkrainHen")) {
            System.out.println(new UkrainHen().getDescription());
            System.out.println(new UkrainHen().getCountOfEggsPerMonth());


        }


    }
}
