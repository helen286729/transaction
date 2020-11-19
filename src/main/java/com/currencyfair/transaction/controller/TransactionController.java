package com.currencyfair.transaction.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.currencyfair.transaction.dto.ResponseData;
import com.currencyfair.transaction.dto.TransactionRequest;
import com.currencyfair.transaction.service.ITransactionService;

@Controller
@RequestMapping("trans")
public class TransactionController {
	
	@Autowired
    private ITransactionService transactionService;
	
	@RequestMapping("list")
	public String listTrans(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession(false);
		
		List<TransactionRequest> transList = transactionService.listTransaction(session);
		model.addAttribute("transList", transList);
		
		return "trans/list";
	}

	@RequestMapping(value = "submit", method = RequestMethod.POST)
	@ResponseBody
	public ResponseData submitTrans(HttpServletRequest request,@RequestBody TransactionRequest transRequest ) {
		HttpSession session = request.getSession();

		List<TransactionRequest> transList = transactionService.submitTransaction(transRequest, session);
		
		return new ResponseData(transList);
	}
}
