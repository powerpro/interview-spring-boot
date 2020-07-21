package com.powerpro.interview.controller;

import java.util.List;

import com.powerpro.interview.model.GuestCard;
import com.powerpro.interview.service.GuestCardService;

import org.springframework.stereotype.Controller;

@Controller
public class GuestCardController {

  public GuestCardService guestCardService;

  public List<GuestCard> findByName(final String name) {
    return guestCardService.findByName(name);
  }

}
