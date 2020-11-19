package com.currencyfair.transaction.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.currencyfair.transaction.dto.TransactionRequest;

public interface ITransactionService {

	
	/**
     * list transaction
     *
     * @param session
     * @return List<TransactionRequest>
     */
    List<TransactionRequest> listTransaction(HttpSession session);
    /**
     * submit transaction
     *
     * @param session
     * @return List<TransactionRequest>
     */
    List<TransactionRequest> submitTransaction(TransactionRequest request, HttpSession session);
}