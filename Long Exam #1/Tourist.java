interface Tourist {

    int budget = 0;

    void visit();
    
    void visit(Boracay boracay);

    void visit (Baguio baguio);

    void visit (Baler baler);

    void visit (Batangas batangas);

    void visit (Bicol bicol);

    void visit (Bohol bohol);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
