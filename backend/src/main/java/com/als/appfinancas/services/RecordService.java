package com.als.appfinancas.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.als.appfinancas.dto.RecordDTO;
import com.als.appfinancas.model.entities.RecordModel;
import com.als.appfinancas.model.entities.UserModel;
import com.als.appfinancas.repositories.RecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repository;

    @Transactional(readOnly = true)
    public List<RecordDTO> findAll(Long id) {
        UserModel obj = new UserModel();
        obj.setId(id);
        List<RecordModel> list = repository.findByUser(obj);
        if (list.isEmpty())
            return new ArrayList<RecordDTO>();

        return list.stream().map(x -> new RecordDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Page<RecordDTO> findPage(Integer page, Integer linesPerPage, String orderBy, String direction, Long id) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);

        UserModel obj = new UserModel();
        obj.setId(id);

        Page<RecordModel> list = repository.findByUser(pageRequest, obj);
        return list.map(x -> new RecordDTO(x));
    }

}
