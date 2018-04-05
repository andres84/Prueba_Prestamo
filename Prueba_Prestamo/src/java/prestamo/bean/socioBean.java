package prestamo.bean;

import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import prestamo.dao.socioDao;
import prestamo.dao.socioDaoImp;
import prestamo.modelo.Socios;

@Named(value = "socioBean")
@ViewScoped
public class socioBean {

    private List<Socios> listar;
    private Socios sicio;
    
    
    public socioBean() {
    }

    public Socios getSicio() {
        return sicio;
    }

    public void setSicio(Socios sicio) {
        this.sicio = sicio;
    }

    public List<Socios> getListar() {
        
        socioDao dao = new socioDaoImp();
        listar = dao.listarSocios();
        
        return listar;
    }

    
    
}
