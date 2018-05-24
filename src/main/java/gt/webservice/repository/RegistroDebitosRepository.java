package gt.webservice.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gt.webservice.entity.RegistroDebitos;

@Repository
public interface RegistroDebitosRepository extends JpaRepository<RegistroDebitos, Serializable>{

}
