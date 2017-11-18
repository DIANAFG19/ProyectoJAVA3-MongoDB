
package unitec.org.mongounitec;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author YOO
 */
@RestController
@RequestMapping("/mensaje")
@CrossOrigin
public class ControladorMensajito {
     @Autowired RepositorioMensajito repoMensa; 
    //Aquí a continuación van las cinco operaciones básicas con la entidad mensaje.
    @RequestMapping(value="/buscar", method=RequestMethod.GET, headers = {"Accept=application/json"})
    
    public ArrayList<Mensajito> obtenerMensajito(@PathVariable String id)throws Exception{
        return (ArrayList<Mensajito>) repoMensa.findAll();
    }
}
