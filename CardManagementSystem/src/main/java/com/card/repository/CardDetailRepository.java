/**
 * 
 */
package com.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.card.entity.CardDetails;

/**
 * @author Softway
 *
 */
@Repository
public interface CardDetailRepository extends JpaRepository<CardDetails, Integer>{

}
