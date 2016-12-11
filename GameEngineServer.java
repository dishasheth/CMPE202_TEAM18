import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Restlet;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;

public class GameEngineServer extends Application {

	/**
	 * Creates a root Restlet that will receive all incoming calls.
	 */
	@Override
	public synchronized Restlet createInboundRoot() {
		Router router = new Router(getContext());

		router.attach("/sortit/database", SortItOutDBResource.class);

		return router;
	}

	public static void main(String[] args) throws Exception {
		// Create a new Component.
		Component component = new Component();

		// Add a new HTTP server listening on port 8080.
		component.getServers().add(Protocol.HTTP, 8088);

		// Attach the sample application.
		component.getDefaultHost().attach("/restlet", new GameEngineServer());

		// Start the component.
		component.start();
	}

}