package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(value ="/calculate",method = RequestMethod.GET)
    public String calc(@RequestParam String operation, @RequestParam int num1, @RequestParam int num2){

        int result;
        switch (operation){

            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if(num2==0){
                    return "Error:0";
                }
                result=num1/num2;
                break;
            default:
                return "Error: Invalid operation. Supported operations are add, subtract, multiply, divide.";

        }
        return "Result:"+result;

    }




}
