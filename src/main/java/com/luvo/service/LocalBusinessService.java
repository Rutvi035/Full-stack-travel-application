package com.luvo.service;

import com.luvo.model.LocalBusiness;
import com.luvo.repository.ILocalBusinessRepository;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LocalBusinessService {

    private final ILocalBusinessRepository localBusinessRepository;

    public LocalBusinessService(ILocalBusinessRepository localBusinessRepository) {
        this.localBusinessRepository = localBusinessRepository;
    }

    public List<LocalBusiness> findAll() {
        return localBusinessRepository.findAll();
    }

    public Optional<LocalBusiness> findById(String id) {
        return localBusinessRepository.findById(id);
    }

    public Optional<LocalBusiness> save(LocalBusiness business) {
        return Optional.of(localBusinessRepository.save(business));
    }

    public void delete(String id) {
        localBusinessRepository.deleteById(id);
    }
}
