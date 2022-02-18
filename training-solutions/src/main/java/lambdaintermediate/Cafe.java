package lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Cafe {

    private List<CoffeeOrder> coffeeOrders;

    public Cafe(List<CoffeeOrder> coffeeOrders) {
        this.coffeeOrders = coffeeOrders;
    }

    public void addCoffeeOrder(CoffeeOrder coffeeOrder) {
        coffeeOrders.add(coffeeOrder);
    }

    public Integer getTotalIncome() {
        return getTotalIncomeFromOrdersStream(coffeeOrders.stream());

    }

    public Integer getTotalIncome(LocalDate date) {
        return getTotalIncomeFromOrdersStream(coffeeOrders.stream()
                .filter(coffeeOrder -> coffeeOrder.getDateTime().toLocalDate().equals(date)));
    }

    private Integer getTotalIncomeFromOrdersStream(Stream<CoffeeOrder> coffeeOrderStream) {
        return coffeeOrderStream
                .flatMapToInt(orders -> orders.getCoffees().stream()
                        .map(Coffee::getPrice)
                        .mapToInt(i->i))
                .sum();
    }

    public long getNumberOfCoffee(CoffeeType type) {
        return coffeeOrders.stream()
                .flatMap(order -> order.getCoffees().stream()
                        .map(Coffee::getType))
                .filter(c -> c == type)
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from) {
        return coffeeOrders.stream()
                .filter(order -> order.getDateTime().isAfter(from))
                .toList();
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return coffeeOrders.stream()
                .filter((coffeeOrder -> coffeeOrder.getDateTime().toLocalDate().equals(date)))
                .sorted(Comparator.comparing(CoffeeOrder::getDateTime))
                .limit(5)
                .toList();
    }
}
