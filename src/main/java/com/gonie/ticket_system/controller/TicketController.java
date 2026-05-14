package com.gonie.ticket_system.controller;

import com.gonie.ticket_system.entity.Ticket;
import com.gonie.ticket_system.repository.TicketRepository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketRepository ticketRepository;

    public TicketController(TicketRepository ticketRepository)
    {
        this.ticketRepository = ticketRepository;
    }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket)
    {
        return ticketRepository.save(ticket);
    }
    
}
