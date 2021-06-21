package com.miggie.musicbyyourears.repo;

import com.miggie.musicbyyourears.repo.entity.PlaylistEntity;
import com.miggie.musicbyyourears.repo.entity.ReviewsEntity;
import com.miggie.musicbyyourears.repo.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Review Repository
 *
 * @author mdjukanovic
 */
public interface ReviewRepository extends JpaRepository<ReviewsEntity, Long> {

    /**
     * Finds reviews for playlists
     * @param playlist Playlist entity
     * @param pageable pageable
     * @return pageable of Playlist entity
     */
    Page<ReviewsEntity> findByPlaylist(PlaylistEntity playlist, Pageable pageable);

    /**
     * Finds reviews by the user who made them
     * @param userEntity User entity
     * @param pageable pageable
     * @return pageable of Playlist entity
     */
    Page<ReviewsEntity> findByUser(UserEntity userEntity, Pageable pageable);
}

