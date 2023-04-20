package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface Product extends RealProduct {

    String getArtist();
    Duration getPlayingTime();
}
