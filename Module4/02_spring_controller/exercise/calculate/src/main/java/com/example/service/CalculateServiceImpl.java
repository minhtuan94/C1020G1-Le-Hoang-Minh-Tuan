package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService{
    @Override
    public double calculator(double a, double b, String calc) {
        double s = 0;
        switch (calc) {
            case "Addition(+)":
                s = a + b;
                break;
            case "Subtraction(-)":
                s = a - b;
                break;
            case "Multiplication(X)":
                s = a * b;
                break;
            default:
                s = a / b;
                break;
        }
        return s;
    }
}
