package com.mohammad.MyWebsite.BlockchainAPIs;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.mohammad.MyWebsite.model.Message;
import com.mohammad.MyWebsite.model.Participant;
import com.mohammad.MyWebsite.model.PartyInformation;
import com.mohammad.MyWebsite.model.TransferParamObject;

import DAO.ParticipantsDAO;



@Path("/digitalWallet")
public class DigitalWallet {
	
	ParticipantsDAO parties = new ParticipantsDAO();
	
	
	
	
	
	
	@POST
	@Path("/transfer")
	public Message transfer(TransferParamObject paramObject) {

		Message message = new Message();
		
		if(paramObject.getSender().equals("C") || paramObject.getReceiver().equals("C")) {
			message.setResponseMessage("Failure Tax Authority cann't participate in a transaction");
			return message;
		}else if(paramObject.getReceiver().equals("B")) {
			
			// check if there is enough balance in the sender account
			if(parties.a.getBalance() < paramObject.getBalanceTT()) {
				message.setResponseMessage("Failure, balance in your account is not enough to complete transaction");
				return message;
			}
			
			double newABalance = parties.a.getBalance() - paramObject.getBalanceTT();
			double newBBalance = parties.b.getBalance() + paramObject.getBalanceTT();
			parties.a.setBalance(newABalance);
			parties.b.setBalance(newBBalance);
			
			System.out.println("A => " + parties.a.getBalance());
			System.out.println("B => " + parties.b.getBalance());
			System.out.println("C => " + parties.c.getBalance());
			
			message.setResponseMessage("Success");
			return message;
		}else {
			
			// check if there is enough balance in the sender account
			if(parties.b.getBalance() < paramObject.getBalanceTT()) {
				message.setResponseMessage("Failure, balance in your account is not enough to complete transaction");
				return message;
			}
			
			double newBBalance = parties.b.getBalance() - paramObject.getBalanceTT();
			
			double tax = (2 * paramObject.getBalanceTT()) / 100 ;
			double balAfterTax = paramObject.getBalanceTT() - tax ;
			double newABalance = parties.a.getBalance() + balAfterTax;
			
			
			parties.a.setBalance(newABalance);
			parties.b.setBalance(newBBalance);
			parties.c.setBalance(parties.c.getBalance() + tax);
			
			System.out.println("A => " + parties.a.getBalance());
			System.out.println("B => " + parties.b.getBalance());
			System.out.println("C => " + parties.c.getBalance());
			
			message.setResponseMessage("Success");
			return message;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GET
	@Path("/viewA")
	public PartyInformation ViewParticipantA() {
		
		System.out.println("############$$$$$$$$$$$$$$$");
		PartyInformation pi = new PartyInformation();
		pi.setName(parties.a.getName());
		pi.setCategory(parties.a.getCategory());
		pi.setBalance(parties.a.getBalance());
		
		System.out.println(pi.getCategory());
		return pi;
	}
	
	
	@GET
	@Path("/viewB")
	public PartyInformation ViewParticipantB() {
		
		System.out.println("############$$$$$$$$$$$$$$$");
		PartyInformation pi = new PartyInformation();
		pi.setName(parties.b.getName());
		pi.setCategory(parties.b.getCategory());
		pi.setBalance(parties.b.getBalance());
		
		System.out.println(pi.getCategory());
		return pi;
	}
	
	@GET
	@Path("/viewC")
	public PartyInformation ViewParticipantC() {
		
		System.out.println("############$$$$$$$$$$$$$$$");
		PartyInformation pi = new PartyInformation();
		pi.setName(parties.c.getName());
		pi.setCategory(parties.c.getCategory());
		pi.setBalance(parties.c.getBalance());
		
		System.out.println(pi.getCategory());
		return pi;
	}
	

}
