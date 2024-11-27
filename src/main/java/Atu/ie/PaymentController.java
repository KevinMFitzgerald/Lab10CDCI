package Atu.ie;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @PostMapping
    public String makePayment(@RequestBody Person person)
    {
        return "got person "+person;

    }
    @GetMapping("/{employeeId}")
    public String EmployeeId(@PathVariable String employeeId){
        return "well done "+employeeId;

    }

}



