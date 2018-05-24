package gt.webservice.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gt.webservice.entity.RegistroDebitos;
import gt.webservice.service.PagosService;
import gt.webservice.util.RequestData;
import gt.webservice.util.ResponseData;

@RestController
public class PagosController {
	
	@Autowired
	private PagosService pagosService;
	
	@RequestMapping(value = "/tarjeta/debitar", method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseData debitar(@RequestBody RequestData request) {
		ResponseData response = new ResponseData(403,"Error", false);
		
		try {
			RegistroDebitos registro = new RegistroDebitos();
			registro.setDpi(request.getDpi());
			registro.setFechaRegistro(new Date());
			registro.setMonto(Double.parseDouble(request.getMonto().replace("_", "")));
			registro.setNumeroTarjeta(request.getNumeroTarjeta());
			
			pagosService.save(registro);
			response.setCode(200);
			response.setMessage("Creado Correctamente");
			response.setValid(true);
		} catch (Exception e) {
			e.printStackTrace();
			response = new ResponseData(500,"Error", false);
		}
		
		return response;
	}

}
