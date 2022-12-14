package DataAccessApi.entities.concretes;

import DataAccessApi.entities.abstracts.DataAccesDao;

public class Telegram implements DataAccesDao {
    @Override
    public void sendMessage() {
        System.out.println("Via Telegram");
    }
}
