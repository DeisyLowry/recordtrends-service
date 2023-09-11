package com.ttrc.recordtrendsService.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "recordedtrends")

public class RecordTrends {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Symbol")
    private String Symbol;

    @Column(name="ChartId")
    private int ChartId;

    @Column(name="Direction")
    private String Direction;

    @Column(name="StartDateTime")
    private Date StartDateTime;

    @Column(name="StartPrice")
    private int StartPrice;

    @Column(name="StartChartStatusId")
    private String StartChartStatusId;

    @Column(name="EndDateTime")
    private Date EndDateTime;

    @Column(name="EndPrice")
    private int EndPrice;

    @Column(name="EndChartStatusId")
    private String EndChartStatusId;

    @Column(name="Details")
    private String Details;

    @Column(name="UserId")
    private String UserId;

}
