package homeWork.kartBank;

interface Action {
     static void oplataKartami(){
          System.out.println("Card payment");
     }

     void block ();
     void recreate ();
     void pay (double sum);
     void showBalance();

}
