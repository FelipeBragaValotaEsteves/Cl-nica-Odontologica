package persistence;

import java.util.List;

public interface IntefaceDao {
     public default void salvar(Object entidade) {
        Dao.getInstance().salvar(entidade);
    }

    public default void atualiza(Object entidade) {
        Dao.getInstance().atualiza(entidade);
    }

    public default void remove(Object entidade) {
        Dao.getInstance().remove(entidade);
    }

    public default void remove(Integer id,Class clazz){
        Dao.getInstance ().remove(id,clazz);
    }
    public default List listar(Class clazz,String where){
        return Dao.getInstance ().listar(clazz, where);
    }
    public default List listar(Class clazz){
        return Dao.getInstance ().listar(clazz, "");
    }
}
