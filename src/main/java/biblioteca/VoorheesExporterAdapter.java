package biblioteca;

import java.util.List;
import org.json.simple.*;
public class VoorheesExporterAdapter extends VoorheesExporter {
	
	
	
	public String exportar(List<Socio> socios) {
		if(socios.isEmpty())
			return "[]";
		
		JSONArray array = new JSONArray();
	    socios.forEach(s -> {
	        JSONObject json = new JSONObject();
	        json.put("Nombre", s.getNombre());
	        json.put("Legajo", s.getLegajo());
	        json.put("Email", s.getEmail());
	        array.add(json);
	    });

		return array.toJSONString();
	}
}
