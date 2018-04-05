package prestamo.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import prestamo.modelo.Socios;
import prestamo.util.HibernateUtil;

public class socioDaoImp implements socioDao{

    @Override
    public List<Socios> listarSocios() {
    
    List<Socios> listarSocios = null;
    
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        
        String consulta = "from Socios";
        
        
        try {
            
            listarSocios = sesion.createQuery(consulta).list();
            t.commit();
            sesion.close();
            
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            t.rollback();
        }
    
        return listarSocios;
    }
    
}
