package Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import DTO.Response;
import DTO.User;

@Controller
public class UserController {
	
	@MessageMapping("/user")
	@SendTo("/topic/user")
	public Response getUser(User user) {
		Response response = new Response();
		response.setContent("Hello: "+user.getName());
		return response;
	}

}
