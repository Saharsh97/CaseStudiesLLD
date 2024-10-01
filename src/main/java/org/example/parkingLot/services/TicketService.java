package org.example.parkingLot.services;

import org.example.parkingLot.models.Ticket;
import org.example.parkingLot.models.enums.VehicleType;
import org.example.parkingLot.repositories.TicketRepository;

public class TicketService {
    TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(String vehicleNumber, VehicleType vehicleType, String ownerName){
        return null;
    }
}
