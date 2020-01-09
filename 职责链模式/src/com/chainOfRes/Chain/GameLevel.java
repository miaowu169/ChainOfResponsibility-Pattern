package com.chainOfRes.Chain;

import com.chainOfRes.request.StarRatingRequest;
/*
 * 创建抽象处理者类
 */
public abstract class GameLevel {
	//定义自类型
	protected GameLevel successor;
	//接收下一家对象
	public void setSuccessor(GameLevel successor) {
		this.successor = successor;
	}
	//抽象处理方法
	public abstract void handleRequest(StarRatingRequest request);
}
