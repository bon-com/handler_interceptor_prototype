package com.example.prototype.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * HandlerInterceptorの基本的な動きを動作検証
 */
public class HandlerLoggingInterceptor implements HandlerInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(HandlerLoggingInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// コントローラーのハンドラメソッド実行前
		logger.info("★★リクエスト開始★★");
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// コントローラーのハンドラメソッド実行後（例外なし）
		logger.info("★★コントローラー処理完了★★");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// レスポンス完了後（例外があっても呼ばれる）
		logger.info("★★レスポンス完了★★");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
}
