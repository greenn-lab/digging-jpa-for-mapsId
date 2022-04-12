package digging.diggingjpaformapsid;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ChildrenService {

  private final EntityManager entityManager;


  public void save() {

    final Children first = Children.builder()
        .name("chan")
        .age(7)
        .build();

    final Bicycle bicycle1 = Bicycle.builder()
        .wheelSize(18.5)
        .children(first)
        .build();

    entityManager.persist(bicycle1);


  }

}
