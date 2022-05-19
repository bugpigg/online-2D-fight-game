package com.bugpigg.game.auth.repository;

import com.bugpigg.game.auth.domain.RefreshToken;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, String> {

    Optional<RefreshToken> findByKey(String key);
    boolean existsByKey(String key);
}
