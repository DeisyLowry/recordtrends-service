package com.ttrc.recordtrendsService.dto;


import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecordTrendsDto {


    private Integer id;

    @NotEmpty(message = "Symbol must be entered")
    private String Symbol;

    private int ChartId;

    @NotEmpty(message = "Direction must be entered")
    private String Direction;

    private Date StartDateTime;


    private int StartPrice;

    @NotEmpty(message = "Start Status must be entered")
    private String StartChartStatusId;

    private Date EndDateTime;

    private int EndPrice;

    @NotEmpty(message = "End Status must be entered")
    private String EndChartStatusId;


    @NotEmpty(message = "Must entered Details")
    private String Details;

    @NotEmpty(message = "Must entered User Id")
    private String UserId;


}
