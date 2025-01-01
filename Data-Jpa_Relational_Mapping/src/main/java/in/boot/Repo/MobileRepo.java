package in.boot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.boot.entity.Mobile;

@Repository
public interface MobileRepo extends JpaRepository<Mobile, Integer>
{

}
