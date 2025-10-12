public enum Topping {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;


    public double getPrice() {
        return switch (this) {
            case BACON -> 1.5;
            case TOMATO -> 0.75;
            case CHEDDAR -> 0.85;
            case MUSTARD -> 0.25;
            case PICKLES -> 1.25;
            default -> 0.0;
        };
    }


}
