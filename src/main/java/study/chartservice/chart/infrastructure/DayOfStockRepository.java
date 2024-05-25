package study.chartservice.chart.infrastructure;

import org.springframework.data.mongodb.repository.MongoRepository;
import study.chartservice.chart.domain.DayOfStock;

public interface DayOfStockRepository extends MongoRepository<DayOfStock, String> {

}
