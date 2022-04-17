package com.company;

public interface Salary {
    int salaryToPayNansamba57153(int hour, int rate);

    default int salaryForOvertimeNansamba57153(int hour, int rate){
        int overtime = hour*rate;
        return overtime;
    }
    static boolean bonusNansamba57153(int yearsOfExperience) {
        if (yearsOfExperience > 5) {
            return true;
        } else {
            return false;
        }
    }
}
