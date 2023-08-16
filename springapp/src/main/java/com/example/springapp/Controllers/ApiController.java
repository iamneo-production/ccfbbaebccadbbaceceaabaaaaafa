import org.springframework
public class ApiController {
    @GetMapping("/")
    public String getName(){
        return "Welcome IamNeo!";
    }
    
}
