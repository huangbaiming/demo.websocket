package com.aaa;


import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

public class SocketHandershakeInterceptor implements HandshakeInterceptor{

	public void afterHandshake(ServerHttpRequest arg0, ServerHttpResponse arg1,
			WebSocketHandler arg2, Exception arg3) {
		// TODO Auto-generated method stub
		System.out.println("afterHandshake");
	}

	public boolean beforeHandshake(ServerHttpRequest arg0,
			ServerHttpResponse arg1, WebSocketHandler arg2,
			Map<String, Object> arg3) throws Exception {
		// TODO Auto-generated method stub
		/*if (arg0 instanceof ServletServerHttpRequest) {
            ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) arg0;
            HttpSession session = servletRequest.getServletRequest().getSession(false);
            String userName = session.getId()+"xq";
            if (session != null) {
//                String userName = (String) session.getAttribute("WEBSOCKET_USERNAME");
            	arg3.put("WEBSOCKET_USERNAME",userName);
                return true;
            }
        }*/
		System.out.println("beforeHandshake");
		return true;
	}

}
