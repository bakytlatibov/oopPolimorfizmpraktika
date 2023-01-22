public class Main {
    public static void main(String[] args) {
//        Hen hen = new RussianHen(2);

//        hen.getDescription();
//        hen.getCountOfEggsPerMonth();
//
//        Hen hen1 = new UkrainHen(3);
//        hen1.getDescription();
//        hen1.getCountOfEggsPerMonth();
//        Hen hen1=new UkrainHen(2);
//        HenFActory.HenFActory("RussianHen");
        Hen[] hen1=new  Hen[]{new RussianHen(3),new UkrainHen(2) };
        HenFActory.HenFActory("RussianHen");
    }
}