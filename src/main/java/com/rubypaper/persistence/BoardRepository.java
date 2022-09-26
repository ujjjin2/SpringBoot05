package com.rubypaper.persistence;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rubypaper.domain.Board;
//5-1
public interface BoardRepository extends CrudRepository<Board, Long>{
	//List<Board> findByTitle(String searchKeyword);
	//List<Board> findByContentContaining(String searchKeyword);
	//List<Board> findByTitleContainingOrContentContaining(String title, String content);
	//List<Board> findByTitleContainingOrderBySeqDesc(String searchKeyword);
	//List<Board> findByTitleContaining(String search, Pageable paging);
	//Page<Board> findByTitleContaining(String searchKeywprd, Pageable paging);
	
	//위치 기반 파라미터 사용
//	@Query("SELECT b FROM Board b WHERE b.title like %?1% ORDER BY b.seq DESC")
//	List<Board> queryAnnotationTest1(String searchKeyword);
	//이름 기반 파라미터 사용
//	@Query("SELECT b FROM Board b WHERE b.title like %:searchKeyword% ORDER BY b.seq DESC")
//	List<Board> queryAnnotationTest1(@Param("searchKeyword") String searchKeyword);
	//특정변수만 조회하기
//	@Query("SELECT b.seq,b.title,b.writer,b.createDate FROM Board b WHERE b.title like %?1%"
//			+"ORDER BY b.seq DESC")
//	List<Object[]> queryAnnotationTest2(@Param("searchKeyword") String searchKeyword);
	
	//네이티브 쿼리 사용하기
//	@Query(value="SELECT seq, title, writer, create_date "
//			+ "FROM board WHERE title like '%'|| ?1 ||'%' "
//			+ "ORDER BY seq DESC", nativeQuery = true)
//	List<Object[]> queryAnnotationTest3(String searchKeyword);
	
	//페이징 및 정렬 처리하기
//	@Query("SELECT b FROM Board b ORDER BY b.seq DESC")
//	List<Board> queryAnnotationTest4(Pageable paging);
	
	List<Board> findByTitle(String title);
	List<Board> findByContentContaining(String searchKeyword);
	List<Board> findByTitleContainingOrContentContaining(String title, String content);
	List<Board> findByTitleContainingOrderBySeqDesc(String searchKeyword);
	Page<Board> findByTitleContaining(String searchKeywprd, Pageable paging);
}
