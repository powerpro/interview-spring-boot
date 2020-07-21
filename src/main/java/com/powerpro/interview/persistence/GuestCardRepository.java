package com.powerpro.interview.persistence;

import com.powerpro.interview.model.GuestCard;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestCardRepository extends JpaRepository<GuestCard, Integer> {

}
