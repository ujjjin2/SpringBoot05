package com.rubypaper.persistence;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.rubypaper.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String>{

	Optional<Member> findById(int i);

	void deleteById(int i);

}
