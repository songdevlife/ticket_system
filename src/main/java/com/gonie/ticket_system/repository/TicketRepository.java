package com.gonie.ticket_system.repository;

import com.gonie.ticket_system.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long>{
    
}