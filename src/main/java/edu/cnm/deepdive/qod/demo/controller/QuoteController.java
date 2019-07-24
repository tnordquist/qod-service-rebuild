package edu.cnm.deepdive.qod.demo.controller;

import edu.cnm.deepdive.qod.demo.model.dao.QuoteRepository;
import edu.cnm.deepdive.qod.demo.model.dao.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sources/{sourceId}/quotes")
public class QuoteController {

  private SourceRepository sourceRepository;
  private QuoteRepository quoteRepository;

  @Autowired
  public QuoteController(SourceRepository sourceRepository, QuoteRepository quoteRepository) {

    this.sourceRepository = sourceRepository;
    this.quoteRepository = quoteRepository;
  }



}
