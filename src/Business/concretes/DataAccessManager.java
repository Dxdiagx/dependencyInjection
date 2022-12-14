package Business.concretes;

import Business.abstracts.DataAccessService;
import DataAccessApi.entities.abstracts.DataAccesDao;

public class DataAccessManager implements DataAccessService {
    private DataAccesDao dataAccesDao;

    public DataAccessManager(DataAccesDao dataAccesDao) {
        this.dataAccesDao = dataAccesDao;
    }


    @Override
    public void sendMessage() {
        dataAccesDao.sendMessage();
    }
}
