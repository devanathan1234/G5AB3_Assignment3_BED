package com.TicTrack.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TicTrack.Project.entity.TicTrac;

public interface TicRepository<TicTrxac> extends JpaRepository<TicTrxac, Integer> {

}

