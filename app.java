package springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class app {
	@RequestMapping("/appp")
	public String showform() {
				return"about";
	}
	@RequestMapping(path ="/first",method=RequestMethod.POST)
        public String handleform(@RequestParam("name") String namee, Model model) {
        	userr n=new userr();
        	n.setName(namee);
        	model.addAttribute(n);
        //	System.out.println(n);
              return "redirect:/second.jsp";    	
        }
	    @RequestMapping(path ="/second",method=RequestMethod.POST)
        public String handleformm(@ModelAttribute crickett user, Model model) {
	    	model.addAttribute(user);  
	    	//System.out.println(user); 	
            return "redirect:/third.jsp";    	
        }	    
	    @RequestMapping(path ="/third",method=RequestMethod.POST)
        public String handleformmmm(@ModelAttribute flagg user, Model model) {
	    	model.addAttribute(user);
       // 	System.out.println(user);
        	return"redirect:/hello";    	
        }
	    @RequestMapping("/hello")
		public String showformm() {
			return"sucess";
		}
		    
}
