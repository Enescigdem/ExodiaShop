/*

// IT IS WORKING BUT BECAUSE OF SEEING ERRORS, IT IS DEACTIVATED

package com.exodiashop.shop.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrController implements ErrorController {


    @RequestMapping("/error")
    public String handleError() {
        //todo: do something like logging
        return "404";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}


 */