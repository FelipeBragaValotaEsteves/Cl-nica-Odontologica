package persistence.login;

import persistence.IntefaceDao;

public interface LoginDao extends IntefaceDao {
    public Object validaLogin(String usuario, String senha);
}
