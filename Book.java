package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface Book extends RealProduct {

    String getAuthor();
    int getPages();
    String getISBN();


}