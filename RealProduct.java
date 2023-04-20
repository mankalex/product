package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface RealProduct {

    double getCost();

    String getFormattedReleaseDate();

    int getQuantityOnHand();

    LocalDate getReleaseDate();

    String getTitle();

    void order(int quantity);
}
