package com.chainOfRes.Client;

import com.chainOfRes.Chain.Bronze;
import com.chainOfRes.Chain.GameLevel;
import com.chainOfRes.Chain.Royalty;
import com.chainOfRes.Chain.Silver;
import com.chainOfRes.request.StarRatingRequest;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.实例化具体处理者对象
		GameLevel objBronze,objSilver,objRoyalty;
		
		objBronze = new Bronze();
		objSilver = new Silver();
		objRoyalty = new Royalty();
		//2.为具体处理者配置下一个处理，形成链
		objBronze.setSuccessor(objSilver);
		objSilver.setSuccessor(objRoyalty);
		//3.实例化请求对象
		StarRatingRequest sr0 = new StarRatingRequest("阿肥",52);
		//4.将请求发送给链的初始对象
		objBronze.handleRequest(sr0);
		
		StarRatingRequest sr1 = new StarRatingRequest("妙乌",58);
		objBronze.handleRequest(sr1);
		
		StarRatingRequest sr2 = new StarRatingRequest("蒸血Stalk",32);
		objBronze.handleRequest(sr2);
		
		StarRatingRequest sr3 = new StarRatingRequest("文轩",10);
		objBronze.handleRequest(sr3);
	}
}
