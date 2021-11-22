package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson best = sales.get(0);
        for (Salesperson salesperson : sales) {
            if (salesperson.getAmount() > best.getAmount()) {
                best = salesperson;
            }
        }
        return best;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson bestPerform = sales.get(0);
        for (Salesperson salesperson : sales) {
            bestPerform = getBetterPerforming(bestPerform, salesperson);
        }
        return bestPerform;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson worstPerform = sales.get(0);
        for (Salesperson salesperson : sales) {
            worstPerform = getWorsePerforming(worstPerform, salesperson);
        }
        return worstPerform;
    }

    private Salesperson getBetterPerforming(Salesperson sales, Salesperson anotherSales) {
        if (getPerform(sales) < getPerform(anotherSales)) {
            return anotherSales;
        }
        return sales;
    }

    private Salesperson getWorsePerforming(Salesperson sales, Salesperson anotherSales) {
        if (getPerform(sales) < getPerform(anotherSales)) {
            return sales;
        }
        return anotherSales;
    }

    private int getPerform(Salesperson salesperson) {
        return salesperson.getAmount() - salesperson.getTarget();
    }
}
