package pro.kosenkov.json_reader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.kosenkov.json_reader.entity.Weapon;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long> {
    Weapon findByNameAndStartDateLessThanEqualAndEndDateGreaterThanEqual(String name, long curDate1, long curDate2);
}
