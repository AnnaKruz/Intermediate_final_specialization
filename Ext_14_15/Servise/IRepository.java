package Ext_14_15.Servise;

import java.util.List;

public interface IRepository <T> {
  
        List <T> getAll();
        T getById(int id);
        int create(T item);
        int update(T item);  
        void delete (int item);  
}
