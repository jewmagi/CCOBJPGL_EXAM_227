public class App {
    public static void main(String[] args) throws Exception {

        Boracay boracay = new Boracay();
        Baguio baguio = new Baguio();
        Baler baler = new Baler();
        Batangas batangas = new Batangas();
        Bicol bicol = new Bicol();
        Bohol bohol = new Bohol();
    
       Me tourist = new Me();
        
       boracay.accept(tourist);
       System.out.println();
       baguio.accept(tourist);
       System.out.println();
       baler.accept(tourist);
       System.out.println();
       batangas.accept(tourist);
       System.out.println();
       bicol.accept(tourist);
       System.out.println();
       bohol.accept(tourist);

    }
}
