package com.example.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class ChangMoneyServiceImpl implements ChangeMoneyService {
    @Override
    public int change(int a, int b) {
        return a*b;
    }
}
