public class RussianHen extends Hen {
    private int eggs;
    private static int counter;

    public RussianHen(int eggs) {
        this.eggs = eggs;
        counter += eggs;
    }
    public RussianHen() {
        counter += eggs;
    }
    @Override
    public boolean getDescription() {
        System.out.println("nenin olkom Russia");
        return true;
    }
    @Override
    public int getCountOfEggsPerMonth() {
        int kob = counter * 30;
        System.out.println("RussianHen aina  " + kob + "  jumurtka tuuim");
        return kob;
    }
    public int getEggs() {
        return eggs;
    }
    public void setEggs(int eggs) {
        this.eggs = eggs;
    }
}
