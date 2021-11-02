package com.CardsProjectBackendG.service;


import com.CardsProjectBackendG.entity.CardOperation;
import java.util.List;

public interface CardOperationService {

    public List<CardOperation> getAllCardOperations();
    public CardOperation getCardOperationById(int theId);
    public void addCardOperation(CardOperation theCardOperation);
    public void deleteCardOperationById(int theId);

}
