package interactivespaces.activity.web.speech;

import java.util.Map;

import com.google.common.collect.Maps;

import interactivespaces.activity.impl.web.BaseWebActivity;

/**
 * A simple Interactive Spaces Java-based activity.
 */
public class WebSpeechJavaActivity extends BaseWebActivity {

	@Override
	public void onActivityActivate() {
	}

	@Override
	public void onNewWebSocketConnection(String connectionId) {
		getLog().info(
				"Got web socket connection from connection " + connectionId);
	}

	@Override
	public void onWebSocketClose(String connectionId) {
		getLog().info("Got web socket close from connection " + connectionId);
	}

	@Override
	public void onWebSocketReceive(String connectionId, Object d) {
		getLog().info("Got web socket data from connection " + connectionId);
		
		Map<String, Object> data = (Map<String, Object>)d;
		getLog().info(data);
	}
}
