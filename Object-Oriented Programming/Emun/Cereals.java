public enum Cereals{
    TRIX(8),
    APPLEJACKS(10),
    CAPTAIN_CRUNCH(9),
    LUCKY_CHARMS(6),
    FROSTED_MINI_WHEATS(10),
    HONEYNUT_CHEERIOS(8),
    CHEERIOS(5),
    CHEX(4);

    int rating;

    Cereals(int rating) { //constructor
        this.rating = rating;
    }
}