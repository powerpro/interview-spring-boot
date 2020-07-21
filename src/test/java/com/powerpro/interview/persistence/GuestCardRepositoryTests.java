package com.powerpro.interview.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.powerpro.interview.model.GuestCard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GuestCardRepositoryTests {

  @Autowired
  private GuestCardRepository guestCardRepository;

  @Test
  void save() {
    GuestCard guestCard = new GuestCard("Test");
    GuestCard saved = guestCardRepository.save(guestCard);
    assertTrue(saved.getId() > 0);

    saved.setName("Foo");
    guestCardRepository.save(saved);
    GuestCard updated = guestCardRepository.findById(saved.getId()).orElse(null);
    assertEquals(saved.getName(), updated.getName());
  }

}
