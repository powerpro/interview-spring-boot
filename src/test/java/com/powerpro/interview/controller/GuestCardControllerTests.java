package com.powerpro.interview.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import com.powerpro.interview.model.GuestCard;
import com.powerpro.interview.persistence.GuestCardRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GuestCardControllerTests {

  @Autowired
  private GuestCardController guestCardController;

  @Autowired
  private GuestCardRepository guestCardRepository;

  @BeforeEach
  private void setup() {
    GuestCard guestCardA = new GuestCard("Foo");
    GuestCard guestCardB = new GuestCard("Bar");
    guestCardRepository.saveAll(Arrays.asList(guestCardA, guestCardB));
  }

  @Test
  void findByName() {
    List<GuestCard> guestCards = guestCardController.findByName("Foo");

    assertTrue(guestCards.size() == 1);
    assertEquals("Foo", guestCards.get(0).getName());
  }

}

