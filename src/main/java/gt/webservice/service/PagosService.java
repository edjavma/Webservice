package gt.webservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.webservice.entity.RegistroDebitos;
import gt.webservice.repository.RegistroDebitosRepository;

public interface PagosService {
	public void save(RegistroDebitos registro) throws Exception;
}


@Service
class PagosServiceImpl implements PagosService {
	
	@Autowired
	private RegistroDebitosRepository registroDebitosRepo;

	@Override
	public void save(RegistroDebitos registro) throws Exception {
		try {
			registroDebitosRepo.save(registro);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		
	}

}
