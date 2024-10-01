package org.example.parkingLot;

import org.example.parkingLot.controllers.TicketController;
import org.example.parkingLot.dtos.IssueTicketRequestDTO;
import org.example.parkingLot.dtos.IssueTicketResponseDTO;
import org.example.parkingLot.models.enums.VehicleType;
import org.example.parkingLot.repositories.TicketRepository;
import org.example.parkingLot.services.TicketService;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Dependencies
        TicketRepository ticketRepository = new TicketRepository();

        TicketService ticketService = new TicketService(ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        // Request
        IssueTicketRequestDTO requestDTO = new IssueTicketRequestDTO();
        requestDTO.setOwnerName("Saharsh");
        requestDTO.setVehicleNumber("MH03AZ7775");
        requestDTO.setVehicleType(VehicleType.CAR);

        // call the controller and get a response back
        IssueTicketResponseDTO responseDTO = ticketController.issueTicket(requestDTO);

        // deal with the response
        System.out.println(responseDTO.getTicketNumber());
    }
}
