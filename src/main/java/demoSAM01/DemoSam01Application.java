package demoSAM01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Attivita;


@SpringBootApplication
@RestController
public class DemoSam01Application {

//	@RequestMapping("/listaAttivita")
//	  public List<Map<String,Object>> listaAttivita() {
//	    Map<String,Object> model = new HashMap<String,Object>();
//	    List<Map<String, Object>> lista = new ArrayList<Map<String,Object>>();
//	    model.put("categoria", "coreDevevelloppement");
//	    lista.add(model);
//	    return lista;
//	}
	
	
	private ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");
	private MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
	
	@RequestMapping("/listaAttivita")
		public List<Attivita> listaAttivita(){
			List<Attivita> lista = new ArrayList<Attivita>();
			Attivita attivita1 = new Attivita();
			attivita1.setCategoria("SPRING ANGULAR IMPLEMENTESCION");
//			attivita.setDataInizio(new Date(new Long(1550584951)));
//			attivita.setDataFine(new Date(new Long(1051191784)));
			attivita1.setDataInizio(new Date(2015,4,17));
			attivita1.setDataScadenza(new Date(2015,4,31));
			attivita1.setNome("QUELLO CHE STO FACENDO IO");
			attivita1.setTempoDedicato(new Double(15));

			lista.add(attivita1);
			
			Attivita attivita2 = new Attivita();
			
			attivita2.setCategoria("AWANAWANA");
//			attivita.setDataInizio(new Date(new Long(1550584951)));
//			attivita.setDataFine(new Date(new Long(1051191784)));
			attivita2.setDataInizio(new Date(2015,4,17));
			attivita2.setDataScadenza(new Date(2015,5,26));
			attivita2.setNome("COSE DI GINO");
			attivita2.setTempoDedicato(new Double(7));
			
			lista.add(attivita2);
						
			Attivita attivita3 = mongoOperation.findOne(new Query(), Attivita.class);
			lista.add(attivita3);
			
			
			return lista;
	}

    public static void main(String[] args) {
        SpringApplication.run(DemoSam01Application.class, args);
    }
}
