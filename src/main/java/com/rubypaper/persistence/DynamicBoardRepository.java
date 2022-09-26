package com.rubypaper.persistence;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.rubypaper.domain.Board;
//동적 쿼리 사용하기
public interface DynamicBoardRepository extends CrudRepository<Board, Long>,
QuerydslPredicateExecutor<Board> {
	
}
