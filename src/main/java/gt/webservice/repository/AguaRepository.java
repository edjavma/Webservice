package gt.webservice.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gt.webservice.entity.Agua;

@Repository
public interface AguaRepository extends JpaRepository<Agua, Serializable>{

}
