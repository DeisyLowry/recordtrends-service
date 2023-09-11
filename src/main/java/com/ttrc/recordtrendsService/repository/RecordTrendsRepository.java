package com.ttrc.recordtrendsService.repository;

import com.ttrc.recordtrendsService.entity.RecordTrends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordTrendsRepository extends JpaRepository <RecordTrends, Integer> {

        //RecordTrends getAllRecordTrends();
        //User getAllUsers();


}
