package com.als.appfinancas.controllers;

import java.util.List;

import com.als.appfinancas.dto.RecordDTO;
import com.als.appfinancas.services.RecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class RecordController {

    @Autowired
    private RecordService service;

    @GetMapping(path = "/records")
    public ResponseEntity<List<RecordDTO>> findAll(@RequestParam(value = "id") Long id) {
        List<RecordDTO> list = service.findAll(id);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(path = "/records/page")
    public ResponseEntity<Page<RecordDTO>> findPage(

            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
            @RequestParam(value = "orderBy", defaultValue = "date") String orderBy,
            @RequestParam(value = "direction", defaultValue = "DESC") String direction,
            @RequestParam(value = "id") Long id

    ) {
        Page<RecordDTO> list = service.findPage(page, linesPerPage, orderBy, direction, id);
        return ResponseEntity.ok().body(list);
    }
}
