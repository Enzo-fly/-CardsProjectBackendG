package com.CardsProjectBackendG.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.CardsProjectBackendG.entity.CardOperation;

@Repository
public class CardOperationDAOImpl implements CardOperationDAO {

	private EntityManager entityManager;
    
    @Autowired
    public CardOperationDAOImpl (EntityManager theEntityManager) {
        entityManager=theEntityManager;
    }


    
    @Override
    public List<CardOperation> getAllCardOperations() {
        //Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = entityManager.createQuery("from CardOperation");
        List <CardOperation> cardOperations = theQuery.getResultList();
        return cardOperations;
    }

    @Override
    public CardOperation getCardOperationById(int theId) {
        //Session currentSession = entityManager.unwrap(Session.class);
        CardOperation theCardOperations = entityManager.find(CardOperation.class, theId);
        return theCardOperations;
    }

    @Override
    public void addCardOperation(CardOperation theCardOperation) {
        //Session currentSession = entityManager.unwrap(Session.class);
        entityManager.merge(theCardOperation);
    }
    


    @Override
    public void deleteCardOperationById(int theId) {
        //Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = entityManager.createQuery("delete from CardOperation where id=:cardOperationId");
        theQuery.setParameter("cardOperationId", theId);
        theQuery.executeUpdate();
    }
}
