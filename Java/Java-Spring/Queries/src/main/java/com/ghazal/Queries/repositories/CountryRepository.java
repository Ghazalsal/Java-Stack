package com.ghazal.Queries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ghazal.Queries.models.Country;


@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
	 @Query(value="SELECT  * from countries join languages on countries.id=languages.country_id WHERE languages.language='Slovene'",nativeQuery=true)
	    List<Country> joinCountriesAndLanguagesWhereLanguage();
	 @Query(value="SELECT countries.name ,COUNT(*) c\r\n"
	 		+ "from cities join countries on countries.id=cities.country_id\r\n"
	 		+ "GROUP BY countries.name HAVING c > 1\r\n"
	 		+ "order by c desc;",nativeQuery=true)
	 	List<Object[]> countcountries();
	 @Query(value="select cities.name,cities.population\r\n"
	 		+ "from countries join cities on cities.country_id=countries.id\r\n"
	 		+ "where countries.name =\"mexico\" AND cities.population>500000\r\n"
	 		+ "order by countries.population desc;",nativeQuery=true)
	 	List<Object[]> mexicopop();
	 @Query(value="select countries.`name`,languages.`language`,languages.percentage\r\n"
	 		+ "from languages join countries on languages.country_id=countries.id\r\n"
	 		+ "where percentage>89\r\n"
	 		+ "order by precentage desc;",nativeQuery=true)
	 	List<Object[]> precentage();
	 @Query(value="select name from countries\r\n"
	 		+ "where surface_area<501 and population>100000",nativeQuery=true)
	 	List<Object[]> surface();
	 @Query(value="\r\n"
	 		+ "select name from countries\r\n"
	 		+ "where life_expectancy<75 and capital>200",nativeQuery=true)
	 	List<Object[]> lifecapital();
	 @Query(value="\r\n"
	 		+ "select countries.name,cities.name,cities.population\r\n"
	 		+ "from countries join cities on cities.country_id=countries.id\r\n"
	 		+ "where countries.name =\"argentina\" AND cities.population>500000\r\n"
	 		+ "order by countries.name desc;",nativeQuery=true)
	 	List<Object[]> pop();
	 @Query(value="SELECT name,\r\n"
	 		+ "       count(*) AS c\r\n"
	 		+ "FROM countries\r\n"
	 		+ "GROUP BY region\r\n"
	 		+ "HAVING c > 1\r\n"
	 		+ "order by name desc;",nativeQuery=true)
	 	List<Object[]> region();
	 	
}