package com.luvo.service;

import com.luvo.model.FamilyPlan;
import com.luvo.repository.IFamilyPlanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyPlannerService {

    @Autowired
    private IFamilyPlanRepository familyPlanRepository;

    public List<FamilyPlan> getPlans() {
        return familyPlanRepository.findAll();
    }

    public FamilyPlan addPlan(FamilyPlan plan) {
        return familyPlanRepository.save(plan);
    }

    public void deletePlan(String id) {
         familyPlanRepository.deleteById(id);
    }
}
