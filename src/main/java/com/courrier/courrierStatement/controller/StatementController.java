package com.courrier.courrierStatement.controller;


import com.courrier.courrierStatement.model.dto.CompleteStatementDTO;
import com.courrier.courrierStatement.model.dto.SummarizeStatementDTO;
import com.courrier.courrierStatement.services.IServiceStatement;
import com.courrier.courrierStatement.services.impl.ServiceStatement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class StatementController {

    private final IServiceStatement serviceStatement;

    public StatementController(IServiceStatement serviceStatement) {
        this.serviceStatement = serviceStatement;
    }



    @GetMapping("/complete-statement")
    public ResponseEntity<CompleteStatementDTO> getCompleteStatement(@PathVariable String id,
                                                                     @PathVariable LocalDate initialDate,
                                                                     @PathVariable LocalDate  finalDate) {
        return null;
    }

    @GetMapping("/summarize-statement")
    public ResponseEntity<SummarizeStatementDTO> getSummarizeStatement(@PathVariable String id,
                                                                       @PathVariable LocalDate initialDate,
                                                                       @PathVariable LocalDate  finalDate) {
        return null;
    }

}
