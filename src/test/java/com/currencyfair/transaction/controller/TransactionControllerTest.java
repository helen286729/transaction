package com.currencyfair.transaction.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.annotation.Rollback;

import com.currencyfair.transaction.dto.ResponseData;
import com.currencyfair.transaction.dto.TransactionRequest;
import com.googlecode.zohhak.api.TestWith;

import junit.framework.TestCase;

public class TransactionControllerTest {
    @Autowired
    private TransactionController transactionController;
    
    private MockHttpServletRequest request;
    
    private MockHttpSession session;
    
    @Before
	public void before() {
    	request = new MockHttpServletRequest();
    	session = new MockHttpSession();
    	List<TransactionRequest> list = new ArrayList<>();
    	session.setAttribute("transList", list);
		request.setSession(session);
		
    }
    
	@Test
	public void testTransactionSubmit() {
		TransactionRequest trans = new TransactionRequest(1, "HKD", "USD", 39.22, 4439.3, 3.2, new Date(), "HK");
		ResponseData data = transactionController.submitTrans(request, trans);
		assertEquals("Save Failed", data.isSuccess());
	 }	
}
