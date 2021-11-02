package com.CardsProjectBackendG.dao;

import java.util.List;
import com.CardsProjectBackendG.entity.CardOperation;

public interface  CardOperationDAO {
public List<CardOperation> getAllCardOperations();
public CardOperation getCardOperationById(int theId);
public void addCardOperation(CardOperation theCardOperation);
public void  deleteCardOperationById(int theId);
}