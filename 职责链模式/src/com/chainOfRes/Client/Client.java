package com.chainOfRes.Client;

import com.chainOfRes.Chain.Bronze;
import com.chainOfRes.Chain.GameLevel;
import com.chainOfRes.Chain.Royalty;
import com.chainOfRes.Chain.Silver;
import com.chainOfRes.request.StarRatingRequest;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.ʵ�������崦���߶���
		GameLevel objBronze,objSilver,objRoyalty;
		
		objBronze = new Bronze();
		objSilver = new Silver();
		objRoyalty = new Royalty();
		//2.Ϊ���崦����������һ�������γ���
		objBronze.setSuccessor(objSilver);
		objSilver.setSuccessor(objRoyalty);
		//3.ʵ�����������
		StarRatingRequest sr0 = new StarRatingRequest("����",52);
		//4.�������͸����ĳ�ʼ����
		objBronze.handleRequest(sr0);
		
		StarRatingRequest sr1 = new StarRatingRequest("����",58);
		objBronze.handleRequest(sr1);
		
		StarRatingRequest sr2 = new StarRatingRequest("��ѪStalk",32);
		objBronze.handleRequest(sr2);
		
		StarRatingRequest sr3 = new StarRatingRequest("����",10);
		objBronze.handleRequest(sr3);
	}
}
