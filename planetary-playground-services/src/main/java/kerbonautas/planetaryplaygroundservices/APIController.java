package kerbonautas.planetaryplaygroundservices;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import predef.PredefSystem;

@RestController
public class APIController {

	@RequestMapping(value = "/newStar",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String newStar(@RequestBody Map<String, Object> payload) 
	    throws Exception {
		//TODO recibir la estrella creada y devolver el sistema solar
		Gson gson = new Gson();
		return gson.toJson("");
	}
	@RequestMapping(value = "/delPlanet",
			method = RequestMethod.DELETE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void deletePlanet(@RequestBody Map<String, Object> payload) 
	    throws Exception {
		Gson gson = new Gson();
		//TODO Eliminar del arrayList el planeta eliminado
	}
	@RequestMapping(value = "/secuencia",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String setSecuencia(@RequestBody Map<String, Object> payload) 
	    throws Exception {
		Gson gson = new Gson();
		return gson.toJson(null);
		//TODO Eliminar del arrayList el planeta eliminado
	}
	@RequestMapping(value = "/preDef",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getPredef(@RequestBody Map<String, Object> payload) 
	    throws Exception {
		SistemaEstelar se = PredefSystem.getSolarSystem(payload.get("SOLAR").toString());
		Gson gson = new Gson();
		return gson.toJson(se);
		//TODO Eliminar del arrayList el planeta eliminado
	}
}
