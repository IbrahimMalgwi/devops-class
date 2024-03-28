import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/v1")
public class UserController{

   @PostMapping("/user")
   public String newUser(){
      return "User created successfully";
   }
}