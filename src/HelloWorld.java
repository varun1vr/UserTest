import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/json")
    public UserDetail getClichedMessage() {
        // Return some cliched textual content
       // App app = new App();
       // app.connect();
        UserDetail userDetail= new UserDetail();
        userDetail.setAge(26);
        userDetail.setJob("developer");
        userDetail.setName("Barun");
        return userDetail;
    }
}