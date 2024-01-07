package org.learning.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/")
public class HomeController {

  @GetMapping
  public String home(Model model) {
    LocalDate today = LocalDate.now();
    int currentYear = today.getYear();
    int previousYear = currentYear - 1;
    String yearAsString = Integer.toString(previousYear);

    model.addAttribute("year", previousYear);
    model.addAttribute("name", "Gabriele");

    return "default/home";
  }
}
