package com.emr.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomErrorController implements ErrorController {


  @RequestMapping("/error")
  @ResponseBody
  String error(HttpServletRequest request) {
    return "<font color=\"red\" >Something went wrong try again</font>";
  }

  public String getErrorPath() {
    return "/error";
  }
}