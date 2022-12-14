import Business.concretes.DataAccessManager;
import DataAccessApi.entities.abstracts.DataAccesDao;
import DataAccessApi.entities.concretes.Whatsapp;

public class Main {
    public static void main(String[] args) {
         DataAccessManager dataAccessManager=new DataAccessManager(new Whatsapp());
         dataAccessManager.sendMessage();
    }
}