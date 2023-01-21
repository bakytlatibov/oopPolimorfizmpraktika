public class UkrainHen extends Hen {

    private int eggs;
    public static int counter;


    public UkrainHen(int eggs) {
        this.eggs = eggs;
        counter+=eggs;
    }

    public UkrainHen() {
counter+=eggs;
    }
    @Override
    public boolean getDescription() {
        System.out.println("menin olkom Ukraina");

        return true;
    }
    @Override
    public int getCountOfEggsPerMonth() {
       int kob=counter*30;
        System.out.println("UkrainHen ayina :"+kob+" jumurtka tuuim");
return kob;
    }
    public int getEggs() {
        return eggs;
    }
    public void setEggs(int eggs) {
        this.eggs = eggs;
    }
    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }


    }
