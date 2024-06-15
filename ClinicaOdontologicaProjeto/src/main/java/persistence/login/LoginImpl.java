package persistence.login;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import model.Login;
import persistence.Dao;

public class LoginImpl implements LoginDao {

    @Override
    public Object validaLogin(String usuario, String senha) {
        System.out.println("ENtrando no valida Login do impl");
        Query query;
        query = Dao.getInstance().getEm().createQuery("SELECT o FROM Login o WHERE o.usuario = :usuario AND o.senha = :senha", Login.class);
        query.setParameter("usuario", usuario);
        query.setParameter("senha", senha);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
