public class BonusMilesService {
    public int calculate(int priceTicket) {
        int milePerCost = 20;

        int miles = priceTicket / milePerCost;
        return miles;
    }
}
