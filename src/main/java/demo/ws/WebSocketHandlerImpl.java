package demo.ws;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

public class WebSocketHandlerImpl implements WebSocketHandler{
	
	private final static Map<String, WebSocketSession> sessionList = new HashMap<String, WebSocketSession>();

	public void afterConnectionClosed(WebSocketSession session, CloseStatus arg1)
			throws Exception {
		// TODO Auto-generated method stub
		String uesrname = (String)session.getAttributes().get("WEBSOCKET_USERNAME");
		sessionList.remove(uesrname);
		
		System.out.println("afterConnectionClosed");
	}

	public void afterConnectionEstablished(WebSocketSession session)
			throws Exception {
		// TODO Auto-generated method stub
		String uesrname = (String)session.getAttributes().get("WEBSOCKET_USERNAME");
		sessionList.put(uesrname, session);
		System.out.println("afterConnectionEstablished");
	}

	public void handleMessage(WebSocketSession arg0, WebSocketMessage<?> arg1)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void handleTransportError(WebSocketSession arg0, Throwable arg1)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean supportsPartialMessages() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
     *
     * @param message
     */
    public void sendMessageToUsers(TextMessage message) {
       /* for (WebSocketSession user : users) {
            try {
                if (user.isOpen()) {
                    user.sendMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }

    /**
     *
     * @param userName
     * @param message
     */
    public void sendMessageToUser(String userName, TextMessage message) {
       /* for (WebSocketSession user : users) {
            if (user.getAttributes().get("WEBSOCKET_USERNAME").equals(userName)) {
                try {
                    if (user.isOpen()) {
                        user.sendMessage(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }*/
    }
}
