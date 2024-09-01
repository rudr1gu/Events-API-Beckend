package com.etec.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.api.domain.events.Event;

public interface EventRepository extends JpaRepository<Event, UUID> {

}
