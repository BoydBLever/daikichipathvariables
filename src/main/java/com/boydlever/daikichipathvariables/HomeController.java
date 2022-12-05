package com.boydlever.daikichipathvariables;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("daikichi")
public class HomeController {
	//The first three routes use RequestMapping annotation with static route URLs
	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	//The last two routes will be dynamic, and use path variables with @PathVariable annotation
	@RequestMapping("/travel/{destination}")
	public String travelMessage(@PathVariable("destination") String destination) {
		return "Congratulations! You will soon travel to " + destination + "!";
	}
	@RequestMapping("/lotto/{number}")
	public String lottoMessage(@PathVariable("number") Integer number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers.";
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}

