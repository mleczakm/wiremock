package com.github.tomakehurst.wiremock.extension.responsetemplating.helpers;

import com.fasterxml.jackson.databind.util.ISO8601Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RenderableDate {

    private final Date date;
    private final String format;

    public RenderableDate(Date date, String format) {
        this.date = date;
        this.format = format;
    }

    @Override
    public String toString() {
        return
            format != null ?
                new SimpleDateFormat(format).format(date) :
                ISO8601Utils.format(date, false);
    }
}
