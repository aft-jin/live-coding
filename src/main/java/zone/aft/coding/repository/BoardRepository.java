package zone.aft.coding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zone.aft.coding.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}