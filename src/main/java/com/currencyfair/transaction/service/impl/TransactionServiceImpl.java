package com.currencyfair.transaction.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.currencyfair.transaction.dto.TransactionRequest;
import com.currencyfair.transaction.service.ITransactionService;

/**
 * Transaction Service API implement.
 *
 * @author helen.tsang
 */
@Service
public class TransactionServiceImpl implements ITransactionService {

	@Override
	public List<TransactionRequest> submitTransaction(TransactionRequest transRequest, HttpSession session) {
		List<TransactionRequest> transList = new ArrayList<>();
		List<TransactionRequest> sessionList = (List<TransactionRequest>) session.getAttribute("transList");
		
		transRequest.setTimePlaced(new Date());
		if (sessionList != null) {
			sessionList.add(transRequest);
			session.setAttribute("transList", sessionList);
		} else {
			transList.add(transRequest);
			session.setAttribute("transList", transList);
		}	
		return transList;
	}

	@Override
	public List<TransactionRequest> listTransaction(HttpSession session) {
		List<TransactionRequest> transList = new ArrayList<>();
		if (session != null) {
			transList = (List<TransactionRequest>) session.getAttribute("transList");
		}
		return transList;
	}

}