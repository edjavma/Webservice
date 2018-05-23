package gt.webservice.service;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.webservice.entity.Agua;
import gt.webservice.repository.AguaRepository;

public interface AguaService {
	public Agua findByContador(String contador);
}

@Service
class AguaServiceImpl implements AguaService {
	
	@Autowired
	private AguaRepository aguaRepo;

	@Override
	public Agua findByContador(String contador) {
		try {
			return aguaRepo.findOne(contador);
		} catch (NoResultException nr) {
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	

}
