public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.println("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        if (budget < boracay.airFare){
            System.out.println("my budget run out");
         } else {
                System.out.println("Enjoying my stay here in Boracay!");
                budget = budget - boracay.airFare;
            }
            checkBudget();
    }

    public void visit(Baguio baguio) { 
            if (budget < baguio.airFare){
                System.out.println("my budget run out");
             } else {
                    System.out.println("Enjoying my stay here in Baguio!");
                    budget = budget - baguio.airFare;
                }
                checkBudget();
    }
    
    public void visit(Baler baler) {
            if (budget < baler.airFare){
                System.out.println("my budget run out");
             } else {
                  System.out.println("Enjoying my stay here in Baler!");
                  budget = budget - baler.airFare;
                }
                checkBudget();
    }

    public void visit(Batangas batangas) {
            if (budget < batangas.airFare){
                System.out.println("my budget run out");
             } else {
                    System.out.println("Enjoying my stay here in Batangas!");
                    budget = budget - batangas.airFare;
                }
                checkBudget();
    }

    public void visit(Bicol bicol) {
            if (budget < bicol.airFare){
                System.out.println("my budget run out");
             } else {
                System.out.println("Enjoying my stay here in Batangas!");
                    budget = budget - bicol.airFare;
                }
                checkBudget();
    }

    public void visit(Bohol bohol) {
            if  (budget < bohol.airFare){
                System.out.println("my budget run out");
             } else {
                    System.out.println("Enjoying my stay here in Bohol!");
                    budget = budget - bohol.airFare;
                }
                
                checkBudget();
    } 

  public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}
