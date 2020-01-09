package com.chainOfRes.Chain;

import com.chainOfRes.request.StarRatingRequest;
/*
 * 创建具体处理者类
 * 当客户端传入的星数在35-55，由该对象处理，否则评定为王者段位
 */
public class Royalty extends GameLevel {
	@Override
	public void handleRequest(StarRatingRequest request) {
		if(request.getStarNumber() < 55) {
			System.out.println("玩家[" + request.getPlayerName() + "]统计为" 
					+ request.getStarNumber() + "颗星，评定为等级：★星耀");
		}else {
			System.out.println("玩家[" + request.getPlayerName() 
			+ "]统计为" + request.getStarNumber() 
			+ "颗星，评定为等级：★王者" + (request.getStarNumber()-55) + "星");
		}
	}
}
