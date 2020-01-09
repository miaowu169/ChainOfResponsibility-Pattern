package com.chainOfRes.Chain;

import com.chainOfRes.request.StarRatingRequest;
/*
 * 创建具体处理者类
 * 当客户端传入的星数在15-35，由该对象处理，否则传递给客户端指定的下家
 */
public class Silver extends GameLevel {
	@Override
	public void handleRequest(StarRatingRequest request) {
		if(request.getStarNumber() < 35) {
			System.out.println("玩家[" + request.getPlayerName() 
			+ "]统计为" + request.getStarNumber() + "颗星，评定为等级：★白银");
		}else {
			if(this.successor != null) {
				this.successor.handleRequest(request);
			}
		}
	}
}
