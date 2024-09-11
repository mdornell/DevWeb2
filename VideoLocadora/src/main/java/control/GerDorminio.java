package control;

import model.dao.*;

public class GerDorminio {

    public GerDorminio() {
        ConectionDAO.getSessionFactory();
    }
    
}
