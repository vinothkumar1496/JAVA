package com.API.SpringBoot_API;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SpringBoot_APIRepository extends JpaRepository<SpringBoot_APIModel, Integer> {

	@Query(nativeQuery=true,value="sp_fetch_API_Details")
	public List <SpringBoot_APIModel> fetchAll();
	
	@Query(nativeQuery=true,value="sp_addData_API_Details :name,:rollnum,:department")
	public void addData(@Param("name") String name,@Param("rollnum") String rollnum,@Param("department") String department);
	
	@Transactional
	@Modifying
	@Query(nativeQuery=true,value="sp_updateData_API_Details :id, :name,:rollnum,:department")
	public void updateData(@Param("id") int id,@Param("name") String name,@Param("rollnum") String rollnum,@Param("department") String department);
	
	@Transactional
	@Modifying
	@Query(nativeQuery=true,value=("sp_deteteData_API_Details :id"))
	public void deleteData(@Param("id")int id);
	
}

