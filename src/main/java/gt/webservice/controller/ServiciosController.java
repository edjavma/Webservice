package gt.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gt.webservice.entity.Agua;
import gt.webservice.service.AguaService;

@RestController
public class ServiciosController {
	
		@Autowired
		private AguaService aguaService;

		@RequestMapping(value = "/agua/find", method = RequestMethod.GET,
				produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
		public Agua findAguaByContador(@RequestParam("contador") String contador) {
			return aguaService.findByContador(contador);
		}
}
