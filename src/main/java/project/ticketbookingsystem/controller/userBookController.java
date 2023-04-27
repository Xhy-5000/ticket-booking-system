package project.ticketbookingsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import project.ticketbookingsystem.service.userBookService;

@RestController
public class userBookController {
    @Autowired
    userBookService userBookService;

    @ResponseBody
    @RequestMapping(value = "/user/book" , consumes = "application/json")
    public Object userBook(@RequestParam int user_id, @RequestParam String insurance, @RequestParam double price, @RequestParam String payment_method){
        return userBookService.book(user_id, insurance, price, payment_method);
    }
}
