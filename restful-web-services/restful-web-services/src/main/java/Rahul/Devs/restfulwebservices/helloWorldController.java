package Rahul.Devs.restfulwebservices;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld(){
        return "how's it going";
    }
    

    @RequestMapping(method = RequestMethod.GET, path = "/helloworldbean")
    public Helloworldbean helloworldbean(){
        return new Helloworldbean("Hello WOrld");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/helloworld/{name}")
    public Helloworldbean helloWorldPathVariable(@PathVariable String name){
        return new Helloworldbean(String.format("Hello %s",name));
    }
}
